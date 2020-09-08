import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val size = scanner.nextInt()
    val array = IntArray(size)

    for(i in 0..array.lastIndex) {
        array[i] = scanner.nextInt()
    }
    val shift = scanner.nextInt()

    val list = array.toList()
    Collections.rotate(list, shift)

    println(list.toIntArray().joinToString(separator = " "))

}