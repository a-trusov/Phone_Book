import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val line = scanner.nextLine()
    val strings = line.split(" ").map { it.trim().toCharArray() }

    for((index, value) in strings.withIndex()) {
        if (value.isEmpty()) {
            continue
        }
        val pr = value.single().isDigit()
        print("$pr")

        if (index != strings.size-1) {
            print("\\")
        }
    }


}