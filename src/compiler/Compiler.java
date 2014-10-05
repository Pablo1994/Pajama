package pajama.compile;

import pajama.js.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;
import java.util.stream.*;
import java.util.Map;
import java.util.Hashtable;

class DepthOffset {

    public Integer d;
    public Integer o;

    public DepthOffset(Integer d, Integer o) {
        this.d = d;
        this.o = o;
    }
}

class SymbolEntry {

    JSId x;
    JSAccess s;
    JSNum offset;

    public SymbolEntry(JSId x, JSNum offset, JSAccess s) {
        this.x = x;
        this.s = s;
        this.offset = offset;
    }

    public JSAccess getAccess() {
        return this.s;
    }

    public JSNum getOffset() {
        return this.offset;
    }

    public void update() {
        this.offset = new JSNum(this.offset.getValue() + 1);
    }

}

public class Compiler extends PajamaBaseVisitor<JSAst> implements Emiter {

    List<JSAst> rules = new ArrayList<>();
    Map<String, SymbolEntry> symbolTable;
    Stack<Integer> stack = new Stack<>();
    int offset = 0;

    public JSAst locate(JSId x) {
        if (this.offset < 0) {
            return x;
        }
        SymbolEntry entry = symbolTable.get(x.getValue());
        List<JSAst> rstack = new ArrayList<>();
        for (Integer k : stack) {
            rstack.add(NUM(k));
        }
        JSAst a = x;
        JSNum off = NUM(this.offset);
        for (JSAst k : rstack) {
            a = ACCESS(a, k);
        }
        a = ACCESS(a, off);
        SymbolEntry e = new SymbolEntry(x, off, (JSAccess) a);
        symbolTable.put(x.getValue(), e);
        return a;
    }

	public SymbolEntry resetAccess(JSId x, JSAccess a){
		SymbolEntry e = new SymbolEntry(x, NULL_OFFSET, a);
		symbolTable.put(x.getValue(), e);
		return e;
	}
    public String PATH = "rt/util.js";

    public void genCode() {
        LOAD(PATH).genCode();
        rules.stream().forEach((t) -> t.genCode());
    }

    public JSAst compile(ParseTree tree) {
        return visit(tree);
    }

    @Override
    public JSAst visitRuleStatement(PajamaParser.RuleStatementContext ctx) {
        JSId id = ID(ctx.ID().getText());
        JSAst formal = visit(ctx.formal());
        JSAst body = visit(ctx.ruleBody());
        JSAst frule = FUNCTION(id, formal, RET(APP(body, formal)));
        rules.add(frule);
        return frule;
    }

    @Override
    public JSAst visitFormal(PajamaParser.FormalContext ctx) {
        return ID(ctx.ID().getText());
    }

    @Override
    public JSAst visitRuleBody(PajamaParser.RuleBodyContext ctx) {
        List<JSAst> fcases = ctx.caseRule().stream()
                .map((c) -> visit(c))
                .collect(Collectors.toList());
        Collections.reverse(fcases);

        return fcases.stream()
                .reduce(FAIL, (z, fc)
                        -> FUNCTION(FORMALS(X), RET(APP(fc, ARGS(X, z)))));

    }

    @Override
    public JSAst visitCaseRule(PajamaParser.CaseRuleContext ctx) {
        symbolTable = new Hashtable<String, SymbolEntry>();
        stack = new Stack<Integer>();
        this.offset = -1;

        JSAst p = visit(ctx.pattern());
        JSAst e = APP(visit(ctx.expr()),N);
        // function(n, c)if(p(n)) return e; else return c(n);
        return FUNCTION(FORMALS(N, C),
                IF(APP(p, N), RET(e), RET(APP(C, N))));
    }

    @Override
    public JSAst visitPatNum(PajamaParser.PatNumContext ctx) {
        JSAst n = NUM(Integer.valueOf(ctx.NUMBER().getText()));
        return FUNCTION(FORMALS(X), RET(EQ(locate(X), n))); //function(x)x===n;
    }

    @Override
    public JSAst visitExprString(PajamaParser.ExprStringContext ctx) {
        return STRING(ctx.STRING().getText());
    }

    @Override
    public JSAst visitPattArray(PajamaParser.PattArrayContext ctx) {
        System.err.println("VisitPattArray");
        return visit(ctx.pattListOrEmpty());
    }

    @Override
    public JSAst visitPattListOrEmpty(PajamaParser.PattListOrEmptyContext ctx) {
        System.err.println("VisitPattListOrEmpty");
        if (ctx.pattList() == null) {
            return visit(ctx.pattEmpty());
        }
        return visit(ctx.pattList());
    }

    @Override
    public JSAst visitPattEmpty(PajamaParser.PattEmptyContext ctx) {
        System.err.println("VisitPattEmpty");
        return EMPTY_PREDICATE();
    }

    @Override
    public JSAst visitPattList(PajamaParser.PattListContext ctx) {
        System.err.println("VisitPattList");
        int lastOffset = this.offset;
        if (this.offset > 0) {
            this.stack.push(this.offset);
        }
        this.offset = 0;
        List<JSAst> args = new ArrayList<JSAst>();
        ctx.pattern()
                .stream()
                .forEach((p) -> {
                    JSAst vp = visit(p);
                    if (vp != null) {
                        args.add(vp);
                    }
                    this.offset++;
                });
        int restOffset = this.offset;
        if (!stack.empty()) this.offset = stack.pop();
        else this.offset = lastOffset;
		JSAst predicateFirstPart = APP(PATLIST, ARGS(ARRAY(args), SLICE(X,NUM(0),NUM(restOffset))));
		JSAst predicateRestPart, predicateComplete;
		if(ctx.pattRestArray()!=null){
			predicateRestPart=visit(ctx.pattRestArray());
			JSAccess a = SLICE(X, NUM(restOffset));
			resetAccess(X,a);
			predicateComplete= AND(predicateFirstPart,
								   APP(predicateRestPart,a));
		}
		else predicateComplete=predicateFirstPart;
		return FUNCTION(FORMALS(X), RET(predicateComplete));
	}

    @Override
    public JSAst visitPArray(PajamaParser.PArrayContext ctx) {
        System.err.println("visitPArray");
        return visit(ctx.pattArray());
    }

    @Override
    public JSAst visitPId(PajamaParser.PIdContext ctx) {
		System.err.println("visitPId");
        JSId id = ID(ctx.ID().getText());
        locate(id);
        return FUNCTION(FORMALS(X), RET(TRUE));
    }

	@Override
	public JSAst visitPattID(PajamaParser.PattIDContext ctx) {
		System.err.println("visitPattID");
		JSId id = ID(ctx.ID().getText());
        locate(id);
        return FUNCTION(FORMALS(X), RET(TRUE));
    }
    //------------------------------------------------------------

    @Override
    public JSAst visitIdSingle(PajamaParser.IdSingleContext ctx) {
		System.err.println("visitIdSingle");
        String value = ctx.ID().getText();
        JSId id = ID(value);
        SymbolEntry entry = symbolTable.get(value);
        if (entry != null) {
            return entry.getAccess().setId(X);
        }
        return id;
    }

    @Override
    public JSAst visitArithOperation(PajamaParser.ArithOperationContext ctx) {
		System.err.println("visitArithOperation");
        List<JSId> opers = ctx.operAddPlus()
                .stream()
                .map((o) -> (JSId) visit(o))
                .collect(Collectors.toList());
        List<JSAst> monoms = ctx.arithMonom()
                .stream()
                .map((m) -> visit(m))
                .collect(Collectors.toList());
        JSAst a = monoms.get(0);
        JSAst point = monoms.stream()
                .skip(1)
                .reduce(POINT(0, a), (z, m) -> {
                    JSPoint p = (JSPoint) z;
                    int k = p.index;
                    return POINT(p.add(1).index, OPERATION(opers.get(k), p.y, m));
                });
				
				/*Para entender mejor el algoritmo:
		JSAst a = monoms.get(0);
		for(int i=1;i<monoms.length;i++){
			a = OPERATION(opers.get(k),a,monoms[i]);
		}
		return a;
		*/
        return ((JSPoint) point).y;
    }

	@Override
	public JSAst visitArithMonom(PajamaParser.ArithMonomContext ctx){
		System.err.println("visitArithMonom");
		List<JSId> opers = ctx.operTimesDiv()
                .stream()
                .map((o) -> (JSId) visit(o))
                .collect(Collectors.toList());
        List<JSAst> singles = ctx.arithSingle()
                .stream()
                .map((m) -> visit(m))
                .collect(Collectors.toList());
        JSAst a = singles.get(0);
        JSAst point = singles.stream()
                .skip(1)
                .reduce(POINT(0, a), (z, m) -> {
                    JSPoint p = (JSPoint) z;
                    int k = p.index;
                    return POINT(p.add(1).index, OPERATION(opers.get(k), p.y, m));
                });
        return ((JSPoint) point).y;
	}
    @Override
    public JSAst visitOperAddPlus(PajamaParser.OperAddPlusContext ctx) {
	System.err.println("visitOperAddPlus");
        return ID(ctx.op.getText());
    }
	@Override
    public JSAst visitOperTimesDiv(PajamaParser.OperTimesDivContext ctx) {
		System.err.println("visitOperTimesDiv");
        return ID(ctx.op.getText());
    }

    @Override
    public JSAst visitFunCallExpr(PajamaParser.FunCallExprContext ctx) {
		System.err.println("visitFunCallExpr");
		JSAst nom = visit(ctx.arithSingle());
		List<JSAst> listArgs;
		if(ctx.params() != null) {
			listArgs = ctx.params().args().expr()
		            .stream()
		            .map((o) -> (JSAst) visit(o))
		            .collect(Collectors.toList());
		}
		else {
			listArgs = ctx.args().expr()
		            .stream()
		            .map((o) -> (JSAst) visit(o))
		            .collect(Collectors.toList());	
		}
		if(listArgs.size()>1) return APP(nom,ARRAY(listArgs));
		return APP(nom,listArgs);
    }
	
	 @Override
    public JSAst visitRelOperation(PajamaParser.RelOperationContext ctx) {
	System.err.println("visitRelOperation");
        List<JSId> opers = ctx.relOperator()
                .stream()
                .map((o) -> (JSId) visit(o))
                .collect(Collectors.toList());
        List<JSAst> ariths = ctx.arithOperation()
                .stream()
                .map((m) -> visit(m))
                .collect(Collectors.toList());
        JSAst a = ariths.get(0);
        JSAst point = ariths.stream()
                .skip(1)
                .reduce(POINT(0, a), (z, m) -> {
                    JSPoint p = (JSPoint) z;
                    int k = p.index;
                    return POINT(p.add(1).index, OPERATION(opers.get(k), p.y, m));
                });
				//OPERATION(OPERADOR><==,A<B<C,D)
				/*Para entender mejor el algoritmo:
				JSAst a = ariths.get(0);
				for(int i=1;i<ariths.length;i++){
					a = OPERATION(opers.get(k),a,ariths[i]);
				}
				return a;
				*/
				
				
				//return APP(FUNCTION(FORMALS(X),RET(((JSPoint) point).y)),X);//Algo asi debe ser.
				return FUNCTION(FORMALS(X),RET(((JSPoint) point).y)); //El problema es que me esta tirando una function en vez de tirar 666 de una vez. o sea hay que hacer apply en algun lado.
				//Falta hacer que sirva para 1<2<3 (1<2 && 2<3)
       // return ((JSPoint) point).y;
    }
	
	@Override
    public JSAst visitRelOperator(PajamaParser.RelOperatorContext ctx) {
		System.err.println("visitRelOperator");
		return ID(ctx.op.getText());
	}
	

    @Override
    public JSAst visitExprNum(PajamaParser.ExprNumContext ctx) {
		System.err.println("visitExprNum");
        return NUM(Integer.valueOf(ctx.NUMBER().getText()));
    }

    @Override
    public JSAst visitExprTrue(PajamaParser.ExprTrueContext ctx) {
        return TRUE;
    }

    @Override
    public JSAst visitExprFalse(PajamaParser.ExprFalseContext ctx) {
        return FALSE;
    }
}

