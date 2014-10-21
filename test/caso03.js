load('rt/util.js');

function size(a) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([function($x) {
          return (patListTestEmpty)($x[0]);
        },
        any], $x);
      })($n)) return (function($x) {
        return $x[1];
      })($n);
      else return ($c)($n);
    })($x, function($x) {
      return (function($n, $c) {
        if ((function($x) {
          return (patListTest)([function($x) {
            return (patListTest)([any], $x.slice(0, 1)) && (any)($x.slice(1));
          },
          any], $x);
        })($n)) return (function($x) {
          return (size)([(function($x) {
            return $x[0].slice(1);
          })($x), (function($x) {
            return ($x[1] + 1);
          })($x)]);
        })($n);
        else return ($c)($n);
      })($x, fail);
    });
  })(a);
}
function sumaRec(a) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTestEmpty)(arguments[0]);
      })($n)) return (function($x) {
        return 0;
      })($n);
      else return ($c)($n);
    })($x, function($x) {
      return (function($n, $c) {
        if ((function($x) {
          return (patListTest)([any], $x.slice(0, 1)) && (any)($x.slice(1));
        })($n)) return (function($x) {
          return ($x[0] + (sumaRec)((function($x) {
            return $x.slice(1);
          })($x)));
        })($n);
        else return ($c)($n);
      })($x, fail);
    });
  })(a);
}
