package org.example.lesson_18

open class Fox(val name: String) {
    open fun eatAction() {
        println("$name -> Лиса съела ягоды.")
    }

    fun sleepAction() {
        println("Питомец уснул.")
    }
}

class Dog(name: String) : Fox(name) {
    override fun eatAction() {
        println("$name -> Собака съела кости.")
    }
}

class Cat(name: String) : Fox(name) {
    override fun eatAction() {
        println("$name -> Кошка съела рыбу.")
    }
}

fun main() {
    val animal1 = Fox("Фокси")
    val animal2 = Dog("Ворчун")
    val animal3 = Cat("Лапка")

    val animalsList = listOf<Fox>(animal1, animal2, animal3)

    animalsList.forEach { animal ->
        animal.eatAction()
    }
}