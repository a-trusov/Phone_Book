import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val direction = scanner.nextInt()
    when(direction) {
        0 -> println("do not move")
        1 -> println("move up")
        2 -> println("move down")
        3 -> println("move left")
        4 -> println("move right")
        else -> println("error!")
    }
}