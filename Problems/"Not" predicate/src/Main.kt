
//val originalPredicate: (Char) -> Boolean = {it == 'x'}
val notPredicate: (Char) -> Boolean = { c: Char -> !originalPredicate(c) }