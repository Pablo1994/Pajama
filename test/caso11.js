load('rt/util.js');

function second(a) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([any, any], $x.slice(0, 2)) && (function($x) {
          return true;
        })($x.slice(2));
      })($n)) return (function($x) {
        return arguments[0][1];
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(a);
}(expectEQ)("second([1,2,3])", "2");
(expectFAIL)("second([1])");
(expectFAIL)("second([])");
