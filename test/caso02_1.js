load('rt/util.js');

function factorialCola(a) {
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
    })($x, function($x) {
      return (function($n, $c) {
        if ((function($x) {
          return (patListTest)([any, any], $x);
        })($n)) return (function($x) {
          return (factorialCola)([(function($x) {
            return ($x[0] - 1);
          })($x), (function($x) {
            return ($x[0] * $x[1]);
          })($x)]);
        })($n);
        else return ($c)($n);
      })($x, fail);
    });
  })(a);
}
