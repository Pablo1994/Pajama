function patListTest(lp, n)
   Array.isArray(n)
   && n.length == lp.length
   && lp.reduce(function(z, p) z && p(n), true)
function patListTestEmpty(x)
	Array.isArray(x) && x.length==0;
var FAIL = new java.lang.Exception("Pattern matching failed");
function fail(){
   throw FAIL;
}

function expectEQ(expr, r){
	try{
		return (eval(expr).toString()===r)
	} catch(e){
		return false;
	}
}
function expectFAIL(expr, f){
	f = f || FAIL;
	try{
		if(typeof expr === 'string'){
			eval(expr);
			throw new java.lang.Exception("expecting to FAIL but it did not: "+expr);
		}
	}
}
function FUNCALL_TO_BE_DONE(){
	return "something needed to be done()";
}
