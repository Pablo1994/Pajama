load('rt/util.js');

function foo(a) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([function($x) {
          return ($x[0] === 0);
        },
        any], $x);
      })($n)) return (function($x) {
        return $x[1];
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(a);
}(expectEQ)("foo([0,2])", "2");
(expectFAIL)("foo([1,1])");
