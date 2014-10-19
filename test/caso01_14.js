load('rt/util.js');

function foo(o) {
  return (function($x) {
    return (function($n, $c) {
      if (((patObjectTest)([function($x) {
        return ($x[name] === "juan"); //esto bien
      }, function($x) {
        return ($x[age] === any); //esto bien
      }], $x))($n)) return (function($x) {
        return $x[1]; //esto mal, una solución salvaje sería hacer que el offset tambien acepte Strings, pero eso podría tener consecuencias feas.
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(o);
}
