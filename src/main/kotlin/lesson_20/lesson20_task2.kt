package org.example.lesson_20

class Player(
    private val name: String,
    private var currentHealth: Int,
    private val maxHealth: Int,
) {
    fun printHealth() {
        println("Здоровье игрока $name: $currentHealth/$maxHealth.")
    }
    
    fun setCurrentHealth() {
        currentHealth = maxHealth
    }
}

fun main() {
    val player1 = Player("Geralt", 64, 100)

    val heal: (Player) -> Unit = { player: Player ->
        player.setCurrentHealth()
    }

    player1.printHealth()
    heal.invoke(player1)
    player1.printHealth()
}