load('rt/util.js');

function goo(n) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([any, function($x) {
          return ($x[1] === 2);
        }], $x);
      })($n)) return (function($x) {
        return $x[0];
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(n);
}(expectEQ)("goo([1,2])", "1");
(expectFAIL)("goo([2,7])");
