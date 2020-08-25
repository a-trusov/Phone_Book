import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val value = scanner.nextInt()

    if (value % 2 == 0) {
        println("Divided by 2")
    }
    if (value % 3 ==0) {
        println("Divided by 3")
    }
    if (value % 5 ==0) {
        println("Divided by 5")
    }
    if (value % 6 ==0) {
        println("Divided by 6")
    }
}