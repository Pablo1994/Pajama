load('rt/util.js');

function rangeIterate(n) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([any, any && function($x) {
          return ($x[0] > $x[1]);
        }], $x);
      })($n)) return (function($x) {
        return [];
      })($n);
      else return ($c)($n);
    })($x, function($x) {
      return (function($n, $c) {
        if ((function($x) {
          return (patListTest)([any, any], $x);
        })($n)) return (function($x) {
          return (unshift)([(function($x) {
            return (rangeIterate)([(function($x) {
              return ($x[0] + 1);
            })($x), (function($x) {
              return $x[1];
            })($x)]);
          })($x), (function($x) {
            return $x[0];
          })($x)]);
        })($n);
        else return ($c)($n);
      })($x, fail);
    });
  })(n);
}(expectEQ)("rangeIterate([1,3])", "1,2,3");
