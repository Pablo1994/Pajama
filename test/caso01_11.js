load('rt/util.js');

function foo11(a) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([function($x) {
          return ($x[0] === 1);
        },
        any && function($x) {
          return ($x[1] > 0);
        }], $x);
      })($n)) return (function($x) {
        return ($x[1] + 1);
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(a);
}(expectEQ)("foo11([1, 41])", "42");
(expectFAIL)("foo11([1, 0])");
