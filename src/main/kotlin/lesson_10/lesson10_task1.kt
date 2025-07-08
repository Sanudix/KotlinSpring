package org.example.lesson_10

import kotlin.random.Random

fun main() {
    val userValueOfRoll = rollOfTheDice()
    println("Ход игрока. Значение кубика: ${userValueOfRoll}")
    val computerValueOfRoll = rollOfTheDice()
    println("Ход комьютера. Значение кубика: ${computerValueOfRoll}")

    when{
        userValueOfRoll > computerValueOfRoll -> println("Победило человечество.")
        userValueOfRoll < computerValueOfRoll -> println("Победил Скайнет.")
        userValueOfRoll == computerValueOfRoll -> println("Победила дружба.")
    }
}

fun rollOfTheDice(): Int = Random.nextInt(1, 7)
