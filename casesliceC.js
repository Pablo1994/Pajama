load('rt/util.js');

function casesliceCA(a) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([function($x) {
          return ($x[0] === 1);
        }, function($x) {
          return (patListTest)([function($x) {
            return ($x[0] === 2);
          }], $x[1].slice(0, 1)) && (any)($x[1].slice(1));
        }], $x);
      })($n)) return (function($x) {
        return $x[1].slice(1)[0];
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(a);
}
function casesliceCB(a) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([function($x) {
          return ($x[0] === 1);
        }, function($x) {
          return (patListTest)([any], $x[1].slice(0, 1)) && (function($x) {
            return (patListTest)([function($x) {
              return ($x[0] === 2);
            }], $x);
          })($x[1].slice(1));
        }], $x);
      })($n)) return (function($x) {
        return $x[1][0];
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(a);
}
