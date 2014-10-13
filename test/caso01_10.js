load('rt/util.js');

function foo10(a) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([any], $x.slice(0, 1)) && (any)(arguments[0]);
      })($n)) return (function($x) {
        return $x.slice(1);
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(a);
}(expectEQ)("foo10([1,2])", "2");
(expectFAIL)("foo10([])");
