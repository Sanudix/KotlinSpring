package org.example.lesson_17

const val RIGHT_ANSWER = "2025"

class QuizElement(_question: String, _answer: String) {
    val question: String = _question
        get() = field
    var answer: String = _answer
        get() = field
        set(value) {
            field = value
            if (value == RIGHT_ANSWER) println("Правильный ответ.")
            else println("Неправильный ответ.")
        }
}

fun main() {
    val quiz1 = QuizElement("Какой сейчас год?", "2023")

    quiz1.answer = "2024"
    quiz1.answer = "2025"
}
