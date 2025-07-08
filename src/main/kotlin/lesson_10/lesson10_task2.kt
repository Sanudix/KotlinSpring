package org.example.lesson_10

const val FOUR = 4

fun main() {
    println("Введите логин и пароль:")
    val userName = readln()
    val userPassword = readln()
    inputDataProcessing(inputName = userName, inputPassword = userPassword)
}

fun inputDataProcessing(inputName: String, inputPassword: String) {
    if (inputPassword.length >= FOUR && inputName.length >= FOUR) println("Вход выполнен.")
    else println("Логин или пароль недостаточно длинные.")
}