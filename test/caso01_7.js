load('rt/util.js');

function foo(n) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([any, any], $x);
      })($n)) return (function($x) {
        return (((1 + ($x[0] * $x[0])) + $x[1]) + (g)((function($x) {
          return $x[0];
        })($x)));
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(n);
}
function prefoosum(n) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([any, any], $x);
      })($n)) return (function($x) {
        return (((1 + $x[0]) + $x[0]) + $x[1]);
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(n);
}
function prefoomulA(n) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([any, any], $x);
      })($n)) return (function($x) {
        return ((1 + ($x[0] * $x[0])) + $x[1]);
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(n);
}
function prefoomulB(n) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([any, any], $x);
      })($n)) return (function($x) {
        return ((($x[0] * $x[0]) + $x[1]) + 1);
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(n);
}
