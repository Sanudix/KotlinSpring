package org.example.lesson_18

abstract class Dice {
    abstract val numberOfSides: Int

    abstract fun throwDice()
}
class FourSidedDice: Dice() {
    override val numberOfSides = 4

    override fun throwDice() {
        val randomValue = (1..4).random()
        println("Кость с 4 гранями брошена. Значение: $randomValue")
    }
}

class SixSidedDice : Dice() {
    override val numberOfSides = 6

    override fun throwDice() {
        val randomValue = (1..6).random()
        println("Кость с 6 гранями брошена. Значение: $randomValue")
    }
}

class EightSidedDice : Dice() {
    override val numberOfSides = 8

    override fun throwDice() {
        val randomValue = (1..8).random()
        println("Кость с 8 гранями брошена. Значение: $randomValue")
    }
}

fun main() {
    val dice1 = FourSidedDice()
    val dice2 = SixSidedDice()
    val dice3 = EightSidedDice()

    val dicesList = listOf<Dice>(dice1, dice2, dice3)

    dicesList.forEach { playingDice ->
        playingDice.throwDice()
    }
}