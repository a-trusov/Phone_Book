import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val len = scanner.nextInt()
    val numbers = IntArray(len) { scanner.nextInt() }
    val m = scanner.nextInt()
    val n = scanner.nextInt()
    var isPresent = false
    for (i in 0 until numbers.lastIndex) {
        isPresent = numbers[i] == m && numbers[i + 1] == n || numbers[i] == n && numbers[i + 1] == m
        if (isPresent) break
    }
    print(if (isPresent) "YES" else "NO")
}