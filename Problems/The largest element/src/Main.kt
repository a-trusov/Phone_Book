import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var max = 0;
    while (scanner.hasNext()) {
        val value = scanner.nextInt()
        if (max < value) {
            max = value
        }
    }
    println(max)
}