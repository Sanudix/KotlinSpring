package org.example.lesson_7

import kotlin.random.Random

fun main() {
    var passwordLength: Int
    do {
        print("Введите генерируемую длину пароля (не меньше 6): ")
        passwordLength = readln().toInt()
    } while (passwordLength < 6)

    var randomNumber: Int
    val numberRange = 0..9
    val uppercaseArabicSymbols = 'A'..'Z'
    val lowercaseArabicSymbols = 'a'..'z'
    var password: String = ""

    password += numberRange.random()
    password += uppercaseArabicSymbols.random()
    password += lowercaseArabicSymbols.random()

    for (i in 1..passwordLength - 3) {
        randomNumber = Random.nextInt(1, 4)
        when (randomNumber) {
            1 -> password += numberRange.random()
            2 -> password += uppercaseArabicSymbols.random()
            3 -> password += lowercaseArabicSymbols.random()
        }
    }
    val shuffledPassword = password.toList().shuffled().joinToString("")
    println("Ваш пароль: $shuffledPassword")
}