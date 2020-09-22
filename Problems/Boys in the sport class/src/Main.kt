import java.util.*
import kotlin.math.absoluteValue

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val h1 = scanner.nextInt()
    val h2 = scanner.nextInt()
    val h3 = scanner.nextInt()

    val arr = arrayListOf<Int>(h1, h2, h3)
    val sortedArr = arr.toMutableList()
    sortedArr.sortByDescending { it.absoluteValue }


    var result = arr.toMutableList() == sortedArr || arr[0] == arr[1] || arr[1] == arr[2]||arr[0] == arr[2]
    println(result)
}
