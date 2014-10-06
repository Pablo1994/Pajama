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
                    return (factorialCola)([(function($x) {
                        return ($x[0] - 1);
                    })($x), (function($x) {
                        return ($x[0] * $x[1]);
                    })($x)]);
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
                    return (n >= 0);
                })($n)) return (function($x) {
                return (factorialCola)([(function($x) {
                    return n;
                })($x), (function($x) {
                    return 1;
                })($x)]);
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
                        return $x.slice(1);
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
                            })($x.slice(1));
                        }, function($x) {
                            return true;
                        }], $x.slice(0, 2));
                    })($n)) return (function($x) {
                    return (largoRC)([(function($x) {
                        return $x.slice(1);
                    })($x), (function($x) {
                        return ($x[1] + 1);
                    })($x)]);
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
                return (largoRC)([(function($x) {
                    return a;
                })($x), (function($x) {
                    return 0;
                })($x)]);
            })($n);
            else return ($c)($n);
        })($x, fail);
    })(a);
}
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
                    return (factorialCola)([(function($x) {
                        return ($x[0] - 1);
                    })($x), (function($x) {
                        return ($x[0] * $x[1]);
                    })($x)]);
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
                    return (n >= 0);
                })($n)) return (function($x) {
                return (factorialCola)([(function($x) {
                    return n;
                })($x), (function($x) {
                    return 1;
                })($x)]);
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
                        return $x.slice(1);
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
                            })($x.slice(1));
                        }, function($x) {
                            return true;
                        }], $x.slice(0, 2));
                    })($n)) return (function($x) {
                    return (largoRC)([(function($x) {
                        return $x.slice(1);
                    })($x), (function($x) {
                        return ($x[1] + 1);
                    })($x)]);
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
                return (largoRC)([(function($x) {
                    return a;
                })($x), (function($x) {
                    return 0;
                })($x)]);
            })($n);
            else return ($c)($n);
        })($x, fail);
    })(a);
}