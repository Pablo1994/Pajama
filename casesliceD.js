load('rt/util.js');

function casesliceDA(a) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([function($x) {
          return ($x[0] === 1);
        }], $x.slice(0, 1)) && (function($x) {
          return (patListTest)([any], $x.slice(0, 1)) && (function($x) {
            return (patListTest)([function($x) {
              return ($x[0] === 2);
            }], $x);
          })($x.slice(1));
        })($x.slice(1));
      })($n)) return (function($x) {
        return $x.slice(1)[0];
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(a);
}
