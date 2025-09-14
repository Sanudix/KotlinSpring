package org.example.lesson_19

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {
    val fishList = Fish.values()

    println("Вы можете добавить в свой аквариум следующих рыб:")
    fishList.forEach { println(it) }
}