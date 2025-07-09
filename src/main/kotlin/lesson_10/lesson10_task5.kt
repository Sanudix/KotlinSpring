package org.example.lesson_10

import kotlin.random.Random

const val LOGIN = "Wizard"
const val PASSWORD = "9!Gendalf="

fun main() {
    print("Введите логин: ")
    val userLogin = readLine()
    print("Введите пароль: ")
    val userPassword = readLine()

    val accessToken = generateToken(login = userLogin, password = userPassword)
    if (accessToken == null)
        println("Неудачная авторизация.")
    else {
        val listOfPurchases = getBasket(token = accessToken)
        println("Список покупок: $listOfPurchases.")
    }
}

fun generateToken(login: String?, password: String?): String? {
    if (LOGIN == login && PASSWORD == password) {
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
    } else {
        return null
    }
}

fun getBasket(token: String?): List<String> {
    val listOfItems = listOf<String>("Кроссовки", "Носки", "Штаны", "Майка", "Бинт")
    return listOfItems
}

