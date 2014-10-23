load('rt/util.js');

function compareObjects(o) {
  return (function($x) {
    return (function($n, $c) {
      if ((function($x) {
        return (patListTest)([(patObjectTest)([function($x) {
          return ($x["name"] === any);
        }], $x), (patObjectTest)([function($x) {
          return ($x["name"] === any && function($x) {
            return ($x["name"][1] == $x["name"][0]);
          });
        }], $x)], $x);
      })($n)) return (function($x) {
        return true;
      })($n);
      else return ($c)($n);
    })($x, function($x) {
      return (function($n, $c) {
        if ((any)($n)) return (function($x) {
          return false;
        })($n);
        else return ($c)($n);
      })($x, fail);
    });
  })(o);
}(expectEQ)('compareObjects([{name:"juan"}, {name:"juan"}])', "true");
(expectEQ)('compareObjects([{name:"juan"}, {name:"Juan"}])', "false");
