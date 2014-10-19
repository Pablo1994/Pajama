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
            return (patListTest)([any], $x[0].slice(0, 1)) && (any)($x[0].slice(1));
          },
          any], $x);
        })($n)) return (function($x) {
          return (size)([(function($x) {
            return $x[0].slice(1)[0];
          })($x), (function($x) {
            return ($x[1] + 1);
          })($x)]);
        })($n);
        else return ($c)($n);
      })($x, fail);
    });
  })(a);
}(expectEQ)("size([[1,2,3,4],0])", "4");
(expectFAIL)("size(1)");
