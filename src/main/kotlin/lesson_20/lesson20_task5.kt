package org.example.lesson_20

class Robot() {
    private var modifier: ((String) -> String)? = null

    fun say(phrase: String) {
        val output = modifier?.invoke(phrase) ?: phrase
        println("Фраза робота: $output")
    }

    fun setModifier(mod: (String) -> String) {
        modifier = mod
    }
}

fun main() {
    val phrases = listOf(
        "Бип-буп! Готов к работе.",
        "Ошибка 404: Юмор не найден.",
        "Зарядка на 100%. Вперёд!",
        "Вжух! Задача выполнена.",
        "Тык-тык. Что дальше?"
    )
    val randomNumber = (0..4).random()

    val robot1 = Robot()

    robot1.say(phrases[randomNumber])

    robot1.setModifier { phrase ->
        phrase.split(" ").reversed().joinToString(" ")
    }

    robot1.say(phrases[randomNumber])
}
