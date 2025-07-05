package org.example.lesson_7

fun main() {
    val rangeCodeOfAuthorization = 1000 until 10000
    var codeOfAuthorization: Int

    do {
        codeOfAuthorization = rangeCodeOfAuthorization.random()
        println("Ваш код авторизации: ${codeOfAuthorization}.")
        print("Введите код для входа: ")
        val enterCode = readln().toInt()
        readln()
    } while (codeOfAuthorization != enterCode)
    println("Вход произведен!")
}