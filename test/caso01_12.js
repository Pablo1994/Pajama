load('rt/util.js');

function foo8(a) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTestEmpty)(arguments[0]);
      })($n)) return (function($x) {
        return true;
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(a);
}
function foo9(a) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([any], $x.slice(0, 1)) && (function($x) {
          return (patListTestEmpty)($x);
        })($x.slice(1));
      })($n)) return (function($x) {
        return true;
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(a);
}
function foo10(a) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([function($x) {
          return ($x[0] === 1);
        }], $x.slice(0, 1)) && (any)($x.slice(1));
      })($n)) return (function($x) {
        return $x.slice(1);
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(a);
}
function foo11(a) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([function($x) {
          return ($x[0] === 1);
        },
        any && function($x) {
          return ($x[1] > 0);
        }], $x);
      })($n)) return (function($x) {
        return ($x[1] + 1);
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(a);
}(expectEQ)("foo8([])", "true");
(expectFAIL)("foo8([42])");
(expectEQ)("foo9([42])", "true");
(expectFAIL)("foo9([42, []])");
(expectEQ)("foo10([1,2,3,4])", "2,3,4");
(expectEQ)("foo10([1])", "");
(expectEQ)("foo11([1, 41])", "42");
(expectFAIL)("foo11([1, 0])");
