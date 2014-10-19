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

    public SymbolEntry(JSId x, JSNum offset, JSAccess s) { //Aquí se debe cambiar la clase JSAccess por una clase abstracta encima de las dos(JSAccess,   JSOAccess)
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
	List<JSAst> tests = new ArrayList<>();
    Map<String, SymbolEntry> symbolTable;
    Stack<JSAst> stack = new Stack<>();
    int offset = 0;
	JSId ruleName;

	public void push(JSAccess a){this.stack.push(a);}
	public void push(int a){this.stack.push(NUM(a));}
	public JSAst pop(){return this.stack.pop();}
		
	public JSAst locatePatternID(JSId x){//revisa que sea toplevel y le pone el acceso.
		System.err.println("locatePatternID: "+x.getValue()+" "+stack+" "+this.offset);
		if(this.offset<0 && this.stack.isEmpty()){//No estamos metidos dentro de ninguna lista. (El argumento no es un array)
			//locateOnTopLevel();
			setOnTopLevel(x);
			return locateOnTopLevel();
		}
		locate(x);
		JSNum off = NUM(this.offset);
		JSAccess a = ACCESS(x,off);
		return a;//$x[offset]
	}
	
	public JSAst locateExprID(JSId x){
		System.err.println("locateExprID: "+x.getValue());
		SymbolEntry entry = symbolTable.get(x.getValue());
        if (entry != null) {
			//if((JSId)(entry.getAccess().left).getValue().equals(this.ruleName.getValue()))
			System.err.println("--NON NULL ENTRY");
			if(entry.getAccess().equals(TOP_ACCESS)){
				return entry.getAccess();}
            return entry.getAccess().setId(X);
        }
		System.err.println("NULL ENTRY RETURNING ID");
        return x;
		
	}
	
    public JSAst locate(JSId x) {//para todos los mortales.
        System.err.println("locate: "+x.getValue()+" "+stack+" "+this.offset);
		if (this.offset < 0 && this.stack.isEmpty())return x;//retorno toda la vara.
        List<JSAst> rstack = new ArrayList<>();
		
		/*Meto TODO EL STACK(antes era de int,ahora jsast)*/
		for(JSAst k:stack){ 
			rstack.add(k);
		}
		
        JSAst a = x;//Guardo el ID en JSast.
        JSNum off = NUM(this.offset);//El offset en la lista actual para accesarla.
		
        for (JSAst k : rstack) {
			if(k instanceof JSAccess){//Esta encadenando los access?
				System.err.println("SI ERA JSACCESS");
				JSAccess na = (JSAccess)k;
				a = na.setLeft(a);//si era x[b], ahora a va a ser x[b][a].
			}
			else {
				 System.err.println("NO ERA UN JSACCESS");
				a = ACCESS(a,k);//La primera vuelta va a ser el access original.
			}
        }
		/*Este cambio lo hice porque en algunos casos me estaba dando
		error creo que en el apply, porque quiero que slice se vuelva
		$x.slice(1)[offset], pero como vimos en el casesliceB si ocupo
		que se vuelva eso.
		*/
		if(this.offset >=0)
			a = ACCESS(a, off);//AL PURO FINAL EL OFFSET.
        SymbolEntry e = new SymbolEntry(x, off, (JSAccess) a);
        symbolTable.put(x.getValue(), e);
        return a;
    }
	
	
	public JSAst setOnTopLevel(JSId x){
		System.err.println("setOnTopLevel: "+this.ruleName.getValue());
		JSAccess a = TOP();
		SymbolEntry e = new SymbolEntry(x,NULL_OFFSET,a);
		symbolTable.put(x.getValue(),e);
		return a;
	}
	
	public JSAst locateOnTopLevel(){
		System.err.println("locateOnTopLevel: "+this.ruleName.getValue());
		SymbolEntry e = symbolTable.get(this.ruleName.getValue());
		if(e!=null)return e.getAccess();
		return setOnTopLevel(this.ruleName);
	}

	public SymbolEntry resetAccess(JSId x, JSAccess a){
		System.err.println("resetAccess: "+x.getValue());
		SymbolEntry e = new SymbolEntry(x, NULL_OFFSET, a);
		symbolTable.put(x.getValue(), e);
		return e;
	}
    public String PATH = "rt/util.js";

    public void genCode() {
        LOAD(PATH).genCode();
        rules.stream().forEach((t) -> t.genCode());
		tests.stream().forEach((s) -> s.genCode());
    }

    public JSAst compile(ParseTree tree) {
		System.err.println("******COMPILING*******");
        return visit(tree);
    }

    @Override
    public JSAst visitRuleStatement(PajamaParser.RuleStatementContext ctx) {
		System.err.println("visitRuleStatement");
        JSId id = ID(ctx.ID().getText());
		ruleName = id;
        JSAst formal = visit(ctx.formal());
        JSAst body = visit(ctx.ruleBody());
        JSAst frule = FUNCTION(id, formal, RET(APP(body, formal)));
        rules.add(frule);
        return frule;
    }

	@Override
	public JSAst visitTestStatement (PajamaParser.TestStatementContext ctx){
		System.err.println("visitTestStatement");
		JSId id = ID(ctx.ID().getText());
		List<JSAst> listArgs = ctx.args().expr()
		            .stream()
		            .map((o) -> visit(o))
		            .collect(Collectors.toList());	
		JSAst ftest = APP(id,listArgs, true);
		tests.add(ftest);
		return ftest;
	}

    @Override
    public JSAst visitFormal(PajamaParser.FormalContext ctx) {
		System.err.println("visitFormal "+ctx.ID().getText());
        return ID(ctx.ID().getText());
    }

    @Override
    public JSAst visitRuleBody(PajamaParser.RuleBodyContext ctx) {
		System.err.println("visitRuleBody ");
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
		System.err.println("---------START CASE RULE-----------");
		System.err.println("visitCaseRule");
        symbolTable = new Hashtable<String, SymbolEntry>();
        stack = new Stack<JSAst>();
        this.offset = -1;

        JSAst p = visit(ctx.pattern());
        JSAst e = APP(visit(ctx.expr()),N);
        // function(n, c)if(p(n)) return e; else return c(n);
		System.err.println("---------FINISH CASE RULE-----------");
        return FUNCTION(FORMALS(N, C),
                IF(APP(p, N), RET(e), RET(APP(C, N))));
    }

    @Override
    public JSAst visitPatNum(PajamaParser.PatNumContext ctx) {
		System.err.println("visitPatNum "+ctx.NUMBER().getText());
        JSAst n = NUM(Integer.valueOf(ctx.NUMBER().getText()));
        return FUNCTION(FORMALS(X), RET(EQ(locatePatternID(X), n))); //function(x)x===n;
    }

	@Override
    public JSAst visitPatString(PajamaParser.PatStringContext ctx) {
		System.err.println("visitExprString");
        return STRING(ctx.STRING().getText());
    }

    @Override
    public JSAst visitExprString(PajamaParser.ExprStringContext ctx) {
		System.err.println("visitExprString");
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
        return EMPTY_PREDICATE(locatePatternID(X));
    }

    @Override
    public JSAst visitPattList(PajamaParser.PattListContext ctx) {
        System.err.println("VisitPattList con offset "+Integer.toString(this.offset));
        int lastOffset = this.offset;
        if (this.offset > 0) {//nota: cambiar a >= en algun momento.
            this.push(this.offset);
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
		if(!stack.empty() && ( (this.stack.peek() instanceof JSNum) ) ){//Si el de mas arriba es num
			this.offset = ( ((JSNum)this.pop()).getValue());
			System.err.println("pattList: tengo un numero en el stack");
			}
		else
			this.offset = lastOffset;
		System.err.println("--VisitPattList: creating predFirstPart");
		JSAst predicateFirstPart;
		if(ctx.pattRestArray()!=null)
			predicateFirstPart = APP(PATLIST,ARGS(ARRAY(args),SLICE((X),NUM(0),NUM(restOffset))));
		else{
			if(this.offset!=-1)
				predicateFirstPart = APP(PATLIST,ARGS(ARRAY(args),ACCESS(X,NUM(offset))));
			else
				predicateFirstPart = APP(PATLIST,ARGS(ARRAY(args),X));
		}
			
		/*Este locate en la primera parte del predicado se
		encarga de hacer todo el desmadre de los accesos, con el nuevo stack, etc.	
		*/
		JSAst predicateRestPart, predicateComplete;
		if(ctx.pattRestArray()!=null){
		//JSAccess slice = SLICE(locatePatternID(X),NUM(restOffset));//$x.slice(1)
			JSAccess slice = SLICE(X,NUM(restOffset));//$x.slice(1)
			if(lastOffset!=-1)
				this.push(this.offset);
			this.push(slice);
			System.err.println("PRESTARRAY: LASTOFFSET: "+Integer.toString(lastOffset)+" OFFSET: "+Integer.toString(this.offset));
			lastOffset = this.offset;
			this.offset = -1;
			System.err.println("--VisitPattList: creating predicateRestPart");
			predicateRestPart=visit(ctx.pattRestArray());//esta visita va a ser relativa a la pila (comienza en 0 de nuevo)
			this.offset = lastOffset;
			this.pop();//le quito uno al stack no se por que. Ah si ya me acorde, es porque se supone que he visitado un nivel.
			if(lastOffset!=-1)
				this.pop();//Pop para el num de offset
			predicateComplete = AND(predicateFirstPart,APP(predicateRestPart, SLICE((X),NUM(restOffset))));
			resetAccess(X,slice);//Esto tampoco lo entendi.
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
    public JSAst visitPId(PajamaParser.PIdContext ctx) {//nota: el profe tiene pattrestID, no se para que.
		System.err.println("visitPId");
        JSId id = ID(ctx.ID().getText());
		//locate(id);//Mismo locate que un ID de expresión. por eso está mal. 10 oct.
		
		this.locate(id);//localiza un patron basado en el offset del ID.
        return ANY;
    }

	/*pre 10 oct, es lo mismo que PID@Override
	public JSAst visitPattID(PajamaParser.PattIDContext ctx) {
		System.err.println("visitPattID");
		JSId id = ID(ctx.ID().getText());
		System.err.println("Visita ID: "+ctx.ID().getText());
        locate(id);
        return ANY;
    }*/
	
	@Override
	public JSAst visitPattRestID(PajamaParser.PattRestIDContext ctx) {
		System.err.println("visitPattRestID");
		JSId id = ID(ctx.ID().getText());
		System.err.println("Visita ID: "+ctx.ID().getText());
        locate(id);
        return ANY;
    }

	@Override
    public JSAst visitPAny(PajamaParser.PAnyContext ctx) {//UNDERSCORE
		System.err.println("visitPAny");
        //return FUNCTION(FORMALS(X), RET(TRUE));
		return ANY;//Cambio vid profe 10 oct.
    }

	@Override
	public JSAst visitPattAny(PajamaParser.PattAnyContext ctx) {
		System.err.println("visitPattAny");
        return FUNCTION(FORMALS(X), RET(TRUE));
    }

	@Override 
	public JSAst visitPattObject(PajamaParser.PattObjectContext ctx){
		System.err.println("visitPattObject");
		int lastOffset = this.offset;
        if (this.offset > 0) {//nota: cambiar a >= en algun momento.
            this.push(this.offset);
        }
        this.offset = 0;
        List<JSAst> pairs = new ArrayList<JSAst>();
        ctx.pattPairs().pattPair()
                .stream()
                .forEach((p) -> {
                    JSAst vp = visit(p);
                    if (vp != null) {
                        pairs.add(vp);
                    }
                    this.offset++;
                });
		if(!stack.empty() && ( (this.stack.peek() instanceof JSNum) ) ){
			this.offset = ( ((JSNum)this.pop()).getValue());
			//System.err.println("pattObject: tengo un acceso en el stack");
			}
		else
			this.offset = lastOffset;
		JSAst predicate;
			if(this.offset!=-1)
				predicate = APP(PATOBJ, ARGS(ARRAY(pairs),X));
			else
				predicate = APP(PATOBJ, ARGS(ARRAY(pairs),X));
		return predicate;
	}

	@Override
	public JSAst visitPattPair(PajamaParser.PattPairContext ctx){
		System.err.println("visitPattPair");
		JSAccess key = ACCESS(X, ID(ctx.key().getText()));
		//this.push(key);
		JSAst value = visit(ctx.pattern());
		JSAst object = FUNCTION(FORMALS(X),RET(EQ(key,value)));
		System.err.println(object);
		return object;
	}
    //------------------------------------------------------------

    @Override
    public JSAst visitIdSingle(PajamaParser.IdSingleContext ctx) {
		System.err.println("visitIdSingle "+ctx.ID().getText());
        String value = ctx.ID().getText();
		System.err.println("--idvalue="+value);
        JSId id = ID(value);
		/*
        SymbolEntry entry = symbolTable.get(value);
        if (entry != null) {
			System.err.println("entró aquí");
            return entry.getAccess().setId(X);
        }
        return id;*/
		//return locate(id);
		return locateExprID(id);
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
		//JSID nomFunc = ctx.arithSingle().idSingle().getText();
		List<JSAst> listArgs;
		if(ctx.params() != null) {
			System.err.println("--TIENE PARAMS");
			listArgs = ctx.params().args().expr()
		            .stream()
		            .map((o) -> (JSAst) APP(visit(o),locate(X)))
		            .collect(Collectors.toList());
		}
		else {
			System.err.println("--NO TIENE PARAMS");
			listArgs = ctx.args().expr()
		            .stream()
		            .map((o) -> (JSAst) APP(visit(o),locate(X)))
		            .collect(Collectors.toList());	
					System.err.println("Visit R!!");
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
                    return POINT(p.add(1).index,OPERATION(opers.get(k), p.y, m));//x<5&&x>10 --> 
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
			if(((JSPoint)point).y.getClass().getName()=="pajama.js.JSString") return ((JSPoint) point).y; //Pienso que esto nos podría servir para resolver el problema del when, no es lo mas elegante, pero al menos así podemos distinguir de cuando hay que devolver una funcion a cuando hay que devolver una variable sola.
		return FUNCTION(FORMALS(X),RET(((JSPoint) point).y)); 
			//return point;//El problema es que me esta tirando una function en vez de tirar 666 de una vez. o sea hay que hacer apply en algun lado.
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


/*locate viejo pre 10 oct RIP 2014-2014. D: 
public JSAst locate(JSId x) { //En este decidí usar una bandera con el valor de offset, en vez de un símbolo, sumarle 100  cada vez que sea un slice.
        System.err.println("locate: "+x.getValue()+" "+stack+" "+this.offset);
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
			int v = ((JSNum) k).getValue();
			if(v > 100) a = SLICE(a,NUM(v - 100)); //importante restar los 100
			else	a = ACCESS(a, k);
        }
		if(this.offset > 100) a = SLICE(a,NUM(offset - 100));
        else a = ACCESS(a, off);
        SymbolEntry e = new SymbolEntry(x, off, (JSAccess) a); //Acá tambien hay que cambiar JSAccess por una clase madre.
        symbolTable.put(x.getValue(), e);
        return a;
    }
*/
