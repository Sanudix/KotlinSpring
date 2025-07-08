package org.example.lesson_10

import kotlin.random.Random

fun main() {
    print("Введите длину пароля: ")
    val passwordLength = readln().toInt()
    println("Ваш пароль: \"${generationPassword(passwordSize = passwordLength)}\"")
}

fun generationPassword(passwordSize: Int): String {
    var createPassword: String = ""
    val rangeOfChar = ' '..'/'
    for (i in 0 until passwordSize) {
        if (i % 2 == 0) createPassword += Random.nextInt(0, 10)
        else createPassword += rangeOfChar.random()
    }
    return createPassword
}