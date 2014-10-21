load('rt/util.js');

function foo(o) {
  return (function($x) {
    return (function($n, $c) {
      if (((patObjectTest)([function($x) {
        return ($x[name] === "juan"); //esto bien
      }, function($x) {
        return ($x[name][age] === any); //esto casi bien
      }], $x))($n)) return (function($x) {
        return $x[name][age][1]; //esto nada bien
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(o);
}
