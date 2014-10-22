load('rt/util.js');

function foo(n) {
  return (function($x) {
    return (function($n, $c) {
      if ((any)($n)) return (function($x) {
        return arguments[0];
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(n);
}(expectEQ)("foo(42)", "42");
(expectEQ)("foo([42])", "42");
