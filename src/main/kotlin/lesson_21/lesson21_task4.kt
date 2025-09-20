package org.example.lesson_21

import java.io.File

fun main() {
    val wordsFile = File("newFile.txt")

    wordsFile.createNewFile()
    wordsFile.writeText(" is the capital of Great Britian")

    wordsFile.appendWord("London")
    println(wordsFile.readText())
}

fun File.appendWord(word: String) {
    val fileContents = if (this.length() > 0) this.readText() else ""

    this.writeText("${word.lowercase()}$fileContents")
}