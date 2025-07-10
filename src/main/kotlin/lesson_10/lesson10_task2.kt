package org.example.lesson_10

const val FOUR = 4

fun main() {
    println("Введите логин и пароль:")
    val userName = readln()
    val userPassword = readln()
    analyzData(inputName = userName, inputPassword = userPassword)
}

fun analyzData(inputName: String, inputPassword: String) {
    if (inputPassword.length >= FOUR && inputName.length >= FOUR) println("Вход выполнен.")
    else println("Логин или пароль недостаточно длинные.")
}