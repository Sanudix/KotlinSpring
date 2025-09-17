package org.example.lesson_21

fun main() {
    print("Введите строку для определения количества гласных букв: ")
    val inputString: String = readln()

    println("Количество гласных букв: ${inputString.vowelCount(inputString)}")
}

fun String.vowelCount(value: String): Int {
    val russianVowels = setOf('а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я')
    val englishVowels = setOf('a', 'e', 'i', 'o', 'u')
    var counter = 0

    for (char in value.lowercase()) {
        if (char in russianVowels || char in englishVowels) {
            counter++
        }
    }
    return counter
}