package adventofcode2023.day_1

import adventofcode2023.readLinesBuffered

fun main() {
    val amendedStrings = readLinesBuffered("app\\src\\main\\kotlin\\adventofcode2023\\day_1\\input.txt")
//    val cleanedStrings: List<String> = extractDigits(amendedStrings)
    println(amendedStrings)

//    var answer = cleanedStrings.sumOf { it.toInt() }
//    println(answer)
}

/**
 * 1. Get the digits from each line of the input as strings
 * 2. Map the digits so we only take the numbers formed by the
 * first and last digits of each line. In case there is only one digits
 * repeat it twice.
 */
fun extractDigits(amendedCalibrations: List<String>): List<String> {
    return amendedCalibrations.map {
        calibration -> calibration.filter {
            it.isDigit()
        }
    }.map {
        if (it.length == 1) {
            it.repeat(2)
        } else {
            it.substring(0, 1) + it.substring(it.length - 1)
        }
    }
}

fun computeDigitsFromString(amendedCalibrations: List<String>): List<String> {
    val digitMap = mapOf(
            "one" to 1,
            "two" to 2,
            "three" to 3,
            "four" to 4,
            "five" to 5,
            "six" to 6,
            "seven" to 7,
            "eight" to 8,
            "nine" to 9,
            )

    amendedCalibrations.map {
        if ()
    }

    return listOf("shit")
}

