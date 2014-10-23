function patListTest(lp, n) {
    print("PattList " + n);
    var res = Array.isArray(n) && n.length == lp.length && lp.reduce(function(z, p) z && p(n), true);
    //if (!Array.isArray(n)) print("no es array");
    //if (!n.length == lp.length) print("**Largos diferentes: " + n.length + " " + lp.length);
    //if (!lp.reduce(function(z, p) z && p(n), true)) print("**El reduce no pego");
    //print("**Resultado: " + res);
    return res;
}

function patObjectTest(lp, o) {
     //print("pot "+ Object.keys(o));
		//print("ENTRANDO A PATOBJECTEST DE "+Object.keys(lp));
		//print("OBJETO A COMPARAR TIENE LLAVES "+Object.keys(o));
  //if(typeof o !='object') {print("NOT AN OBJECT");return false;}
  var keys = Object.keys(lp);
  var resultado =  keys.reduce(function(z, k)z&&lp[k](o), true);
  //print("PATOBJECTEST DE "+keys+" ME DIO "+resultado);	
  return resultado;
}
function patObjectTestEmpty(o){
	return typeof o==='object'&&Object.keys(o).length==0;
}


function patListTestEmpty(x)
Array.isArray(x) && x.length == 0;

var FAIL = new java.lang.Exception("Pattern matching failed");

function fail() {
    throw FAIL;
}

function any(x) {
    //print("Any("+x+")");
    //if (x == null) print("ANY(" + x + ")==NULL");
    //if (patListTestEmpty(x)) print("ANY(" + x + ")==PATLISTESTEMPTY");
    return x != null;
}

function expectEQ(expr, r) {
    if (eval(expr).toString() === r) return true;
    else throw new java.lang.Exception("expectEQ:" + expr + "===" + "'" + r + "'");

}

function expectFAIL(expr, f) {
    f = f || FAIL;
    try {
        if (typeof expr === 'string') {
            eval(expr);
            throw new java.lang.Exception("expecting to FAIL but it did not: " + expr);
        } else throw new java.lang.Exception("expectFAIL: invalid type" + expr);
    } catch (e) {
        if (e === f) return true;
        throw e;
    }
    return false;
}

function unshift(a) {
    a[0].unshift(a[1]);
    return a[0];
}


function identidad(x) x;

function g(x) x*x;