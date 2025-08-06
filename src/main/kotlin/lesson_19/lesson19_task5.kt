package org.example.lesson_19

class Human(private val name: String) {
    private lateinit var gender: Genders

    fun addHuman(_gender: Genders) {
        gender = _gender
        println("Данные о человеке добавлены.")
    }

    fun getName() = name
    fun getGender() = gender
}

enum class Genders {
    MALE,
    FEMALE,
}

fun setGender(): Genders {
    lateinit var inputGender: Genders
    do {
        print("Введите пол: ")
        val genderString = readln().uppercase()
        when (genderString) {
            Genders.FEMALE.name -> inputGender = Genders.FEMALE
            Genders.MALE.name -> inputGender = Genders.MALE
            else -> println("Введено некорретное значение.")
        }
    } while (genderString != Genders.FEMALE.name && genderString != Genders.MALE.name)
    return inputGender
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
        print("\nВведите ФИО: ")
        val inputName = readln()
        val human = Human(inputName)
        human.addHuman(setGender())
        humanList.add(human)
    }

    println("\nСписок человек в картотеке:")
    humanList.forEach {
        println("ФИО: ${it.getName()}; пол: ${it.getGender()}")
    }
}

