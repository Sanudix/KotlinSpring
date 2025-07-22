package org.example.lesson_16

const val VALUE_OF_HEALING_POTION = 25
const val MAX_HEALTH = 100

class Gamer(
    private val name: String,
    private var health: Int,
    private var punchPower: Int,
    private var healAbility: Boolean = true,
) {
    fun healing(): String {
        health += VALUE_OF_HEALING_POTION
        if (health > 100) {
            health = 100
            return "Вы использовали зелье лечения. Ваше текущее здоровье: $health/$MAX_HEALTH."
        } else {
            return "Вы использовали зелье лечения. Ваше текущее здоровье: $health/$MAX_HEALTH."
        }
    }

    fun injury(damage: Int): String {
        health -= damage
        if (health > 0) {
            return "Вы получили $damage урона. Ваше текущее здоровье: $health/$MAX_HEALTH."
        } else {
            deathScript()
            return "Вы погибли."
        }
    }

    private fun deathScript() {
        health = 0
        punchPower = 0
        healAbility = false
    }
}

fun main() {
    val gamer1 = Gamer("Богдан", 100, 20)

    println(
        """Вам не повезло и по пути в деревню вы наткнулись на грифона.
        |Однако специально на такой случай у вас куплен меч и зелья лечения.
        |Бой начинается!!!
        |
        |Грифон слегка вас задел. ${gamer1.injury(10)} Вы решаете продолжить бой.
        |Грифон вас сильно ранил ударом клюва. ${gamer1.injury(30)} 
        |Вы решаете подлечиться. ${gamer1.healing()}
        |В ожесточенном сражении вы обмениваетесь ударами с грифоном. 
        |${gamer1.injury(40)} 
        |${gamer1.injury(40)}
        |Грифон злится из-за ранений, хватает вас и взлетает.
        |Вы стараетесь полностью восстановиться и выпиваете все зелья лечения. 
        |${gamer1.healing()}
        |${gamer1.healing()}
        |${gamer1.healing()}
        |${gamer1.healing()}
        |Грифон сбрасывает вас с большой высоты. ${gamer1.injury(999)}
    """.trimMargin()
    )
}