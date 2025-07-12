package org.example.lesson_10

import kotlin.random.Random

const val LOGIN = "Wizard"
const val PASSWORD = "9!Gendalf="

fun main() {
    print("Введите логин: ")
    val userLogin = readLine()
    print("Введите пароль: ")
    val userPassword = readLine()

    authorization(login = userLogin, password = userPassword)
}

fun generateToken(login: String?, password: String?): String? {
    val numberRange = 0..9
    val charRange = 'a'..'z'
    var token: String = ""
    token += numberRange.random()
    token += charRange.random()
    for (i in 0 until 30) {
        val randomNumber = Random.nextInt(0, 2)
        if (randomNumber % 2 == 0)
            token += numberRange.random()
        else
            token += charRange.random()
    }

    val shuffledToken = token.toMutableList().apply { shuffle() }.joinToString("")
    return shuffledToken
}

fun authorization(login: String?, password: String?) {
    if (LOGIN == login && PASSWORD == password) {
        println("Авторизация прошла успешно.")
        val accessToken = generateToken(login = login, password = password)
        val listOfPurchases = getBasket(token = accessToken)
        println("Список покупок: $listOfPurchases.")
    }
    else {
        println("Авторизация провалена.")
    }
}

fun getBasket(token: String?): List<String> {
    val listOfItems = listOf<String>("Кроссовки", "Носки", "Штаны", "Майка", "Бинт")
    return listOfItems
}

