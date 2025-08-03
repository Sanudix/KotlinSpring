package org.example.lesson_19

class Human() {
    private lateinit var name: String
    private lateinit var gender: Genders

    fun addHuman() {
        print("\nВведите ФИО: ")
        name = readln()

        do {
            print("Введите пол: ")
            val genderString = readln().uppercase()
            when (genderString) {
                Genders.FEMALE.name -> gender = Genders.FEMALE
                Genders.MALE.name -> gender = Genders.MALE
                else -> println("Введено некорретное значение.")
            }
        } while (genderString != Genders.FEMALE.name && genderString != Genders.MALE.name)

        println("Данные о человеке добавлены.")
    }

    fun getName() = name
    fun getGender() = gender
}

enum class Genders {
    MALE,
    FEMALE,
}

fun main() {
    println(
        """"
        |При создании записи о человеке в картотеке вы можете ввести:
        |-ФИО человека (например, Иванов Иван Иванович)
        |-пол (доступны 2 значения: male, female)
        |За раз необходимо добавить 5 человек.
        |""".trimMargin()
    )

    val humanList = mutableListOf<Human>()

    while (humanList.size != 5) {
        val human = Human()
        human.addHuman()
        humanList.add(human)
    }

    println("\nСписок человек в картотеке:")
    humanList.forEach {
        println("ФИО: ${it.getName()}; пол: ${it.getGender()}")
    }
}

