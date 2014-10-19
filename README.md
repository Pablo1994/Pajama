********JOTA********
-Observo que en el caso 9 hay una posible ambiguedad de lo que pasa si uno pone un array vacio en el patrest,
porque podria yo mandar [2,[]] y deberia hacer match, sin embargo como está actualmente hará match diciendo como,
2 es el último elemento del array, es decir [2] hace el match con [x|[]]. Habrá que ver si en casos futuros no
repercute.

*******Pablo*******
Creo que estoy cerca, en vez de cambiar el offset para que acepte String, hice otro offset llamado offsetS, y un push a la pila que convierte ese String en un ID, imagino que ahora todo es meter nuevas condiciones a los locate, pero no estoy seguro de dónde

