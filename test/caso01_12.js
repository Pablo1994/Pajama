load('rt/util.js');

function foo8(a) {
    return (function(x) {
        return (function(n, c) {
            if ((function(x) {
                    return (patListTestEmpty)(x);
                })(n)) return function(x) {
                return true;
            };
            else return (c)(n);
        })(x, fail);
    })(a);
}

function foo9(a) {
    return (function(x) {
        return (function(n, c) {
            if ((function(x) {
                    return (patListTest)([function(x) {
                        return true;
                    }], x.slice(0, 1)) && (function(x) {
                        return (patListTestEmpty)(x);
                    })(x.slice(1));
                })(n)) return function(x) {
                return true;
            };
            else return (c)(n);
        })(x, fail);
    })(a);
}

function foo10(a) {
    return (function(x) {
        return (function(n, c) {
            if ((function(x) {
                    return (patListTest)([function(x) {
                        return (x[0] === 1);
                    }], x.slice(0, 1)) && (function(x) {
                        return true;
                    })(x.slice(1));
                })(n)) return function(x) {
                return x.slice(1);
            };
            else return (c)(n);
        })(x, fail);
    })(a);
}

function foo11(a) {
    return (function(x) {
        return (function(n, c) {
            if ((function(x) {
                    return (patListTest)([function(x) {
                        return (x[0] === 1);
                    }, function(x) {
                        return (x[1] > 0);
                    }], x.slice(0, 2));
                })(n)) return function(x) {
                return (x[1] + 1);
            };
            else return (c)(n);
        })(x, fail);
    })(a);
}
