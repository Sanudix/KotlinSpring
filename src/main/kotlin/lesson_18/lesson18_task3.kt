package org.example.lesson_18

abstract class Pet(val name: String) {
    abstract val food: String

    fun eatAction() {
        println("$name -> ест $food.")
    }

    fun sleepAction() {
        println("$name спит.")
    }
}

class Fox(name: String) : Pet(name) {
    override val food = "ягоды"
}

class Dog(name: String) : Pet(name) {
    override val food = "кости"
}

class Cat(name: String) : Pet(name) {
    override val food = "рыбу"
}

fun main() {
    val pet1 = Fox("Фокси")
    val pet2 = Dog("Ворчун")
    val pet3 = Cat("Лапка")

    val petsList = listOf<Pet>(pet1, pet2, pet3)

    petsList.forEach { pet ->
        pet.eatAction()
    }
}