import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val count = scanner.nextInt()

    var min=Int.MAX_VALUE
    repeat(count) {
        val num = scanner.nextInt()
        if (num < min) {
            min = num
        }
    }
    println(min)
}