load('rt/util.js');

function fooarg(a) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([any, any], $x);
      })($n)) return (function($x) {
        return $x[0];
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(a);
}(expectEQ)("fooarg([1,2])", "false");
(expectEQ)("fooarg([3,4])", "true");
(expectFAIL)("fooarg(2)");
