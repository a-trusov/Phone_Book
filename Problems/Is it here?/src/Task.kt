import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val size = scanner.nextInt()

    val array = IntArray(size)
    for (i in 0..array.lastIndex) {
        array[i] = scanner.nextInt()
    }

    val m = scanner.nextInt()
    var isPresent = false
    for(n in array) {
       if (n == m) {
           isPresent = true
           break
       }
    }

    println(if (isPresent) "YES" else "NO")
}