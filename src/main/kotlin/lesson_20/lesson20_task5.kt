package org.example.lesson_20

class Robot() {
    val phrases = listOf(
        "Бип-буп! Готов к работе.",
        "Ошибка 404: Юмор не найден.",
        "Зарядка на 100%. Вперёд!",
        "Вжух! Задача выполнена.",
        "Тык-тык. Что дальше?"
    )

    private var modifier: ((String) -> String)? = { it }

    fun say(phrase: List<String>) {
        val randomNumber = (0..4).random()
        val output = modifier?.invoke(phrase[randomNumber]) ?: phrase
        println("Фраза робота: $output")
    }

    fun setModifier(mod: (String) -> String) {
        modifier = mod
    }
}

fun main() {
    val robot1 = Robot()

    robot1.say(robot1.phrases)

    robot1.setModifier { phrase ->
        phrase.split(" ").reversed().joinToString(" ")
    }

    robot1.say(robot1.phrases)
}
