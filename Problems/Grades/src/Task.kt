import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val count = scanner.nextInt()

    var a = 0
    var b = 0
    var d = 0
    var c = 0

    repeat(count) {
        val detect = scanner.nextInt()
        if (detect == 2) {
            d += 1
        }

        if (detect == 3) {
            c += 1
        }

        if (detect == 4) {
            b += 1
        }

        if (detect == 5) {
            a += 1
        }
    }

    println("$d $c $b $a")
}