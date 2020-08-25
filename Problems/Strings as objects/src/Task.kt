fun main() {
    val input = readLine()!!
    if (!input.isEmpty()) {
        val first = input.first()
        when (first) {

            'i' -> {
                val str = input.drop(1)
                println(str.toInt().plus(1))
            }
            's' -> {
                println(input.drop(1).reversed())
            }
            else -> println(input)
        }

    }
}