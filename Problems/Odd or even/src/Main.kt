import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    println(if (number % 2 ==0) "EVEN" else "ODD")
}