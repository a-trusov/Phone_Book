package phonebook

import java.io.File
import java.time.Duration


fun main() {
    val fileName = """C:\Users\user\Downloads\directory.txt"""
    val phoneBook = File(fileName).readLines()

    val entriesFileName = """C:\Users\user\Downloads\find.txt"""
    val entries = File(entriesFileName).readLines()

    println("Start searching...")
    val start = System.currentTimeMillis()
    var foundEntries = 0;

    for (entry in entries) {
        val phone = searchByName(phoneBook, entry)
        foundEntries += 1
    }

    val stop = System.currentTimeMillis()
    val timeTaken = getDisplayValue(stop - start) //116328
    println("Found ${foundEntries} / ${entries.size} entries. Time taken: ${timeTaken}")
//    println("Found 500 / 500 entries. Time taken: 1 min. 56 sec. 328 ms.")
}

fun searchByName(phoneBook: List<String>, name: String):String {
    var result ="No fond"
    for(line in phoneBook) {
        val regex = """^(\d+)(\s)([\w\s]+)$""".toRegex()
        val matchResult: MatchResult? = regex.find(line)
        if (matchResult != null) {
            val (number, _, fullname) = matchResult.destructured

            if (name == fullname) {
                result = number
                break
            }
        }
    }
    return result
}



fun getDisplayValue(ms: Long): String {
    val duration = Duration.ofMillis(ms)
    val minutes = duration.toMinutes()
    val seconds = duration.minusMinutes(minutes).seconds
    val ms = duration
            .minusMinutes(minutes)
            .minusSeconds(seconds).toMillis()
    return "${minutes} min. ${seconds} sec. ${ms} ms."
}

