package org.example.lesson_20

class Gamer(val keyAvailable: Boolean) {
    fun getStatus() = keyAvailable
}

fun main() {
    val gamer1 = Gamer(false)
    val gamer2 = Gamer(true)

    val checkKey: (Gamer) -> String = { gamer: Gamer ->
        if (gamer.getStatus()) "Игрок открыл дверь."
        else "Дверь заперта."
    }

    val checkResult1 = checkKey(gamer1)
    val checkResult2 = checkKey(gamer2)

    println(checkResult1)
    println(checkResult2)
}