package org.example.lesson_23

fun main() {
    val human1 = Human(Gender.MALE, 24, "Russia")

    val (humanGender, humanAge, humanCountry) = human1

    println(
        """
        Пол: $humanGender
        Возраст: $humanAge
        Страна: $humanCountry
        """.trimIndent()
    )
}

enum class Gender() {
    MALE,
    FEMALE
}

data class Human(
    val gender: Gender,
    val age: Int,
    val country: String,
)