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
}

fun Player.isHealthy(_player: Player): Boolean {
    if (_player.getMaxHealth() == _player.getCurrentHealth()) return true
    else return false
}