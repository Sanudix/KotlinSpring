package org.example.lesson_10

import kotlin.random.Random

fun main() {
    var counterOfRounds = 1
    var counterOfWins = 0

    do {
        println("\nРаунд ${counterOfRounds++}")
        val userValueOfRoll = rollOfTheDice()
        println("Ход игрока. Значение кубика: ${userValueOfRoll}")
        val computerValueOfRoll = rollOfTheDice()
        println("Ход комьютера. Значение кубика: ${computerValueOfRoll}")
        when {
            userValueOfRoll > computerValueOfRoll -> {
                println("--Победило человечество--")
                counterOfWins++
            }
            userValueOfRoll < computerValueOfRoll -> println("--Победил Скайнет--")
            userValueOfRoll == computerValueOfRoll -> println("--Победила дружба--")
        }
        val userChoice = playMaker()
    } while (userChoice.equals("да", ignoreCase = true))
    println("Количество побед человека: $counterOfWins.")
}

fun rollOfTheDice(): Int = Random.nextInt(1, 7)

fun playMaker(): String {
    print("Хотите бросить кости еще раз?\nВаш ответ (да/нет): ")
    val userInput = readln()
    return userInput
}