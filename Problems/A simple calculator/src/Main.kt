import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextLong()
    val operator = scanner.next()
    val b = scanner.nextLong()

    val result = when(operator) {
        "+" -> a + b
        "-" -> a - b
        "/" -> { if (b == 0L)
            "Division by 0!"
            else
            a / b
        }
        "*" -> a * b
        else -> "Unknown operator"
    }
    println(result)
}