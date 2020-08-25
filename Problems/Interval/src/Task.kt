import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val int = scanner.nextInt()

//    (−15,12]∪(14,17)∪[19,+∞)
    if (int > -15 && int <=12 || int>14 && int < 17 || int >= 19 )
        print("True")
    else
        print("False")
}