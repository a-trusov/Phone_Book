import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val count = scanner.nextInt()
    var larger = 0
    var smaller= 0
    var perfect = 0

    repeat(count) {
        val detect = scanner.nextInt()
        if (detect == 0) {
            perfect += 1
        }

        if (detect > 0) {
            larger += 1
        }
        if (detect < 0) {
            smaller += 1
        }

    }

    println("$perfect $larger $smaller")
}