import java.util.Scanner
import kotlin.math.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var d = scanner.nextDouble()
    print(floor(d * 10) % 10)
}