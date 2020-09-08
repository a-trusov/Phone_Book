import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val size = scanner.nextInt()
    var count = 0
    for(i in 0..size-1) {
        count += scanner.nextInt()
    }
    println(count)
}