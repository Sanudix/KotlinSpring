package org.example.lesson4

fun main() {
    val daysOfTraining = 6

    println(
        """
        Упражнение для рук:    ${daysOfTraining % 2 != 0}
        Упражнение для ног:    ${daysOfTraining % 2 == 0}
        Упражнение для спины:  ${daysOfTraining % 2 == 0}
        Упражнение для пресса: ${daysOfTraining % 2 != 0}
        """.trimIndent()
    )
}