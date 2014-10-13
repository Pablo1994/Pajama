load('rt/util.js');

function foo9(a) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([any], $x.slice(0, 1)) && (function($x) {
          return (patListTestEmpty)($x.slice(1));
        })(arguments[0]);
      })($n)) return (function($x) {
        return true;
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(a);
}(expectEQ)("foo9([1])", "true");
(expectFAIL)("foo9([1,1])");
