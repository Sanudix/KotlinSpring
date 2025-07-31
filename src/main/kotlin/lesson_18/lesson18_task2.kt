package org.example.lesson_18

open class FourSidedDice() {
    open val numberOfSides = 4

    open fun throwCube() {
        val randomValue = (1..4).random()
        println("Кость с 4 гранями брошена. Значение: $randomValue")
    }
}

class SixSidedDice() : FourSidedDice() {
    override val numberOfSides = 6

    override fun throwCube() {
        val randomValue = (1..6).random()
        println("Кость с 6 гранями брошена. Значение: $randomValue")
    }
}

class EightSidedDice() : FourSidedDice() {
    override val numberOfSides = 8

    override fun throwCube() {
        val randomValue = (1..8).random()
        println("Кость с 8 гранями брошена. Значение: $randomValue")
    }
}

fun main() {
    val dice1 = FourSidedDice()
    val dice2 = SixSidedDice()
    val dice3 = EightSidedDice()

    val dicesList = listOf<FourSidedDice>(dice1, dice2, dice3)

    dicesList.forEach { playingDice ->
        playingDice.throwCube()
    }
}