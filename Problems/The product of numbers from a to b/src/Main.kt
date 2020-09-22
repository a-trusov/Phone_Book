import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val start = scanner.nextInt()
    val stop = scanner.nextInt()

    var result = 1L
    if (start <= stop) {
        for (i in start until stop) {
            result *= i
        }
    }
    println(result)
}