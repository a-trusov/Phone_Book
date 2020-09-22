import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var sum = 0;
    while (scanner.hasNext()) {
        val value = scanner.nextInt()
        sum += value
        if (value == 0) {
            break;
        }

    }
    println(sum)
}