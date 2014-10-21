load('rt/util.js');

function foo(o) {
  argumento=o;
  return (function($x) {
    return (function($n, $c) {
      if (((patObjectTest)([function($x) {
        return ($x["name"] === "juan");
      }, any($x)
      ], $x))($n)) return (function($x) {
        return $x["age"];
      })($n);
      else return ($c)($n);
    })($x, fail);
  })(o);
}(expectEQ)("foo({name:'juan', age:20})", "20");
