package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {
    fun printUserInfo() {
        println("\nПользователь $id")
        println("Логин: $login")
        println("Пароль: $password")
        println("Почта: $mail")
        println("Био: $bio")
    }

    fun inputBio() {
        print("Кратко опишите биографию: ")
        bio = readln()
    }

    fun changePassword() {
        print("Введите текущий пароль: ")
        val currentPassword = readln()
        if (currentPassword == password) {
            print("Введите новый пароль: ")
            password = readln()
            println("Пароль изменен!")
        } else {
            println("Неверный пароль. Вы заблокированы.")
        }
    }
}

fun main() {
    val user1: User2 = User2(
        id = 1,
        login = "Alex",
        password = "11101",
        mail = "mexico20@gmail.com",
    )
    user1.inputBio()
    user1.changePassword()
    user1.printUserInfo()
}

