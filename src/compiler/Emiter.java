package pajama.compile;
import pajama.js.*;
import java.util.*;

public interface Emiter{
    default JSNum NUM(int value){ return new JSNum(value);}
	default JSString STRING(String value){ return new JSString(value);}
    default JSId  ID(String value){return new JSId(value);}
    default JSFunction FUNCTION(List<JSAst> formals, JSAst body){
        return new JSFunction(formals, body);
    }
    default JSFunction FUNCTION(JSId name, JSAst body){
        return new JSFunction(name, Arrays.asList(), body);
    }
    default JSFunction FUNCTION(JSAst arg, JSAst body){
        return new JSFunction(Arrays.asList(arg), body);
    }
    default JSFunction FUNCTION(JSId id, JSAst arg, JSAst body){
        return new JSFunction(id, Arrays.asList(arg), body);
    }
    default JSIf IF(JSAst c, JSAst t, JSAst e){
        return new JSIf(c, t, e);
    }
    default JSApply APP(JSAst c, JSAst e){
        return new JSApply(c, e);
    }
    default JSApply APP(JSAst f, List<JSAst> args){
        return new JSApply(f, args);
    }
	default JSApply APP(JSAst c, JSAst e, boolean b){
        return new JSApply(c, e, b);
    }
    default JSApply APP(JSAst f, List<JSAst> args, boolean b){
        return new JSApply(f, args, b);
    }
    default List<JSAst> ARGS(JSAst... args){ return Arrays.asList(args);}
    default List<JSAst> FORMALS(JSAst... args){ return Arrays.asList(args);}
    default JSAst EQ(JSAst a, JSAst b){
        return OPERATION(OPER("==="), a, b);
    }
    default JSAst OPERATION(JSAst oper, JSAst a, JSAst b){
        return new JSOperation(oper, a, b);
    }
    default JSAst ASSIGN(JSAst a, JSAst b){
		return OPERATION(OPER("="),a,b);
    }
    default JSAst LOAD(String s){ return new JSLoad(s);}
    default JSArray ARRAY(List<JSAst> args){ return new JSArray(args);}
    default JSAccess ACCESS(JSAst a, JSAst k){return new JSAccess(a, k);}
	default JSOAccess OACCESS(JSAst a, JSId k){return new JSOAccess(a,k);}
    default JSAst RET(JSAst e){ return new JSReturn(e);}
    default JSAst OPER(String op){return new JSId(op);}
	default JSPoint POINT(int x, JSAst y){return POINT(NUM(x), y);}
    default JSPoint POINT(JSNum x, JSAst y){return new JSPoint(x, y);}
	default JSAnd AND(JSAst l, JSAst r){return new JSAnd(l,r);}
	default JSAst TO_BE_DONE(String msg){return ID(msg+"()");}
	default JSAst FUNCALL(JSAst id, List<JSAst> args){return new JSFuncall(id,args);}
	default JSAst EMPTY_PREDICATE(JSAst x){
		return FUNCTION(FORMALS(X), RET(APP(ISEMPTY, x)));
	}
	default JSAst KEY_PATT(JSAst key,JSAst value){
		return new JSPair(key,value);
	}
	default JSAst EMPTY_OBJECT_PREDICATE(JSAst x){
		return FUNCTION(FORMALS(X), RET(APP(ISEMPTY_OBJECT, x)));
	}
	default JSOAccess SLICE(JSAst a, JSAst n){
		return new JSOAccess(a, SLICE, ARGS(n));
	}
	default JSOAccess SLICE(JSAst a, JSAst s, JSAst e){
		return new JSOAccess(a, SLICE, ARGS(s,e));
	}
	default JSAccess TOP(){
		return TOP_ACCESS;
	}
	default JSObject OBJECT(List<JSAst> pairs){
		return new JSObject(pairs);
	}
	final JSArray EMPTY_ARRAY = new JSArray();
	final JSId ANY = new JSId("any");
    final JSBool TRUE = new JSBool(true);
    final JSBool FALSE = new JSBool(false);
	final JSNum ZERO = new JSNum(0);
    final JSId X = new JSId("$x");
    final JSId N = new JSId("$n");
    final JSId C = new JSId("$c");
	final JSId ARGUMENTS = new JSId("arguments");
    final JSId FAIL = new JSId("fail");
	final JSNum NULL_OFFSET = new JSNum(-1);
	final JSId PATOBJ = new JSId("patObjectTest");
    final JSId PATLIST = new JSId("patListTest");
	final JSId ISEMPTY = new JSId("patListTestEmpty");
	final JSId ISEMPTY_OBJECT = new JSId("patObjectTestEmpty");	
	final JSId LENGTH_ID = new JSId("length");
	final JSId SLICE = new JSId("slice");
	final JSAccess TOP_ACCESS = new JSAccess(ARGUMENTS,ZERO);
}
