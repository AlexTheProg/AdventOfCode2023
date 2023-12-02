package adventofcode2023

import java.io.File

fun readLinesBuffered(fileName: String): List<String> = File(fileName).bufferedReader().readLines()