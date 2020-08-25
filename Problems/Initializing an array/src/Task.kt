//var numbers = Array(100, { i ->
//    when (i) {
//        0 -> 1
//        9 -> 10
//        99 -> 100
//        else -> 0
//    }
//})
var numbers = IntArray(100).apply { this[0] = 1; this[9] = 10; this[99] = 100 }

