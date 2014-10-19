load('rt/util.js');

function factorial(n) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (arguments[0] >= 0);
      })($n)) return (function($x) {
        return (factorialCola)([(function($x) {
          return arguments[0];
        })($x), (function($x) {
          return 1;
        })($x)]);
      })($n);
      else return ($c)($n);
    })($x, function($x) {
      return (function($n, $c) {
        if ((any)($n)) return (function($x) {
          return 0;
        })($n);
        else return ($c)($n);
      })($x, fail);
    });
  })(n);
}
