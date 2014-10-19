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
