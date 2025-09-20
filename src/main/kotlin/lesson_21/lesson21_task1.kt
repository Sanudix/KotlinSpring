package org.example.lesson_21

fun main() {
    print("Введите строку для определения количества гласных букв: ")
    val inputString: String = readln()

    println("Количество гласных букв: ${inputString.vowelCount()}")
}

fun String.vowelCount(): Int {
    val russianVowels = setOf('а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я')
    val englishVowels = setOf('a', 'e', 'i', 'o', 'u')

    return this.lowercase() .count { it in russianVowels || it in englishVowels }
}