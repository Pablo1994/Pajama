load('rt/util.js');

function caso1(n) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (arguments[0] === 0);
      })($n)) return (function($x) {
        return false;
      })($n);
      else return ($c)($n);
    })($x, function($x) {
      return (function($n, $c) {
        if ((function($x) {
          return (arguments[0] === 1);
        })($n)) return (function($x) {
          return true;
        })($n);
        else return ($c)($n);
      })($x, fail);
    });
  })(n);
}(expectEQ)("caso1(0)", "false");
(expectEQ)("caso1(1)", "true");
(expectFAIL)("caso1(2)");
