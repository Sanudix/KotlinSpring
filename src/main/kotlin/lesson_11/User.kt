package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
) {}

fun main() {
    val user1: User = User(
        id = 1,
        login = "Staker",
        password = "112bjD1",
        mail = "kanada123@gmail.com",
    )

    val user2: User = User(
        id = 2,
        login = "EnglishBoy",
        password = "skjghGJHB1",
        mail = "umpalumpa@gmail.com",
    )

    printUserInfo(user = user1)
    printUserInfo(user = user2)
}

fun printUserInfo(user: User) {
    println("Пользователь ${user.id}")
    println(user.login)
    println(user.password)
    println(user.mail)
}