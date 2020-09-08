import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val g = 9.8
    val plot = scanner.nextDouble()
    val h = scanner.nextDouble()

    val p = plot * g * h

    println(p)

}