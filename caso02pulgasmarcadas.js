load('rt/util.js');

function factorialCola(a) {
    return (function($x) {
        return (function($n, $c) {
            if ((function($x) {
                    return (patListTest)([function($x) {
                        return ($x[0] === 0);
                    }, function($x) {
                        return true;
                    }], $x.slice(0, 2));
                })($n)) return (function($x) {
                return $x[1];
            })($n);
            else return ($c)($n);
        })($x, function($x) {
            return (function($n, $c) {
                if ((function($x) {
                        return (patListTest)([function($x) {
                            return true;
                        }, function($x) {
                            return true;
                        }], $x.slice(0, 2));
                    })($n)) return (function($x) {
                    return (factorialCola)([function($x) {
                        return ($x[0] - 1);
                    }, function($x) {
                        return ($x[0] * $x[1]);
                    }]);
                })($n);
                else return ($c)($n);
            })($x, fail);
        });
    })(a);
}

function factorial(n) {
    return (function($x) {
        return (function($n, $c) {
            if ((function($x) {
                    return (n >= 0); // n debería ser $x
                })($n)) return (function($x) {
                return (factorialCola)([function($x) {
                    return n; // debería ser $x
                }, function($x) {
                    return 1;
                }]);
            })($n);
            else return ($c)($n);
        })($x, function($x) {
            return (function($n, $c) {
                if ((function($x) {
                        return true;
                    })($n)) return (function($x) {
                    return 0;
                })($n);
                else return ($c)($n);
            })($x, fail);
        });
    })(n);
}

function largo(a) {
    return (function($x) {
        return (function($n, $c) {
            if ((function($x) {
                    return (patListTestEmpty)($x);
                })($n)) return (function($x) {
                return 0;
            })($n);
            else return ($c)($n);
        })($x, function($x) {
            return (function($n, $c) {
                if ((function($x) {
                        return (patListTest)([function($x) {
                            return true;
                        }], $x.slice(0, 1)) && (function($x) {
                            return true;
                        })($x.slice(1));
                    })($n)) return (function($x) {
                    return ((largo)((function($x) {
                        return r; // Este r debería ser $x.slice(1)
                    })($x)) + 1);
                })($n);
                else return ($c)($n);
            })($x, fail);
        });
    })(a);
}

function largoRC(a) {
    return (function($x) {
        return (function($n, $c) {
            if ((function($x) {
                    return (patListTest)([function($x) {
                        return (patListTestEmpty)($x);
                    }, function($x) {
                        return true;
                    }], $x.slice(0, 2));
                })($n)) return (function($x) {
                return $x[1];
            })($n);
            else return ($c)($n);
        })($x, function($x) {
            return (function($n, $c) {
                if ((function($x) {
                        return (patListTest)([function($x) {
                            return (patListTest)([function($x) {
                                return true;
                            }], $x.slice(0, 1)) && (function($x) {
                                return true;
                            })($x.slice(1)); //debería ser x[0].slice()
                        }, function($x) {
                            return true;
                        }], $x.slice(0, 2));
                    })($n)) return (function($x) {
                    return (largoRC)([function($x) {
                        return $x[0]; // PULGA: Debería ser $x[0].slice(1), o bien, $x[1]
                    }, function($x) {
                        return ($x[1] + 1); // Si el anterior es $x[1] este debería ser $x[2]
                    }]);
                })($n);
                else return ($c)($n);
            })($x, fail);
        });
    })(a);
}

function largo2(a) {
    return (function($x) {
        return (function($n, $c) {
            if ((function($x) {
                    return true;
                })($n)) return (function($x) {
                return (largoRC)([function($x) {
                    return a;
                }, function($x) {
                    return 0;
                }]);
            })($n);
            else return ($c)($n);
        })($x, fail);
    })(a);
}