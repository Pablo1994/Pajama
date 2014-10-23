load('rt/util.js');

function foo(n) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([any, any, any], $x);
      })($n)) return (function($x) {
        return (((1 + $x[0]) + $x[1]) + ($x[2])((function($x) {
          return $x[0];
        })($x)));
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(n);
}(expectEQ)("foo([2, 3, function(x){return x+2;}])", "10");
