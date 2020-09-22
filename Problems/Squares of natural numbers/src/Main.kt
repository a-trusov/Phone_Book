import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    var i = 1
    while (i*i <= number) {
        println( i * i)
        i++
    }
}