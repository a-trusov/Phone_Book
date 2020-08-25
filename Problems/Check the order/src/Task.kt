import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val count = scanner.nextInt()

    var isSorted = true

    var cou = scanner.nextInt()
    repeat(count - 1) {
        var num = scanner.nextInt()
        if (cou > num) {
            isSorted = false
        }
        cou = num
    }

    if (isSorted) {
        println("YES")
    } else {
        println("NO")
    }
}