package org.example.lesson_21

class Player(
    private val name: String,
    private var currentHealth: Int,
    private val maxHealth: Int,
) {
    fun printHealth() {
        println("Здоровье игрока $name: $currentHealth/$maxHealth.")
    }

    fun changeCurrentHealth() {
        currentHealth = maxHealth
    }

    fun getMaxHealth(): Int {
        return maxHealth
    }

    fun getCurrentHealth(): Int {
        return currentHealth
    }
}

fun main() {
    val player1 = Player("Albert", 100, 100)
    val player2 = Player("Arnold", 80, 100)

    player1.isHealthy()
    player2.isHealthy()
}

fun Player.isHealthy(): Boolean {
    return this.getMaxHealth() == this.getCurrentHealth()
}