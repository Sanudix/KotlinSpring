package org.example.lesson_19

class Human(private val name: String) {
    private var gender: Gender? = null

    fun setHumanGender(_gender: Gender) {
        gender = _gender
        println("Данные о человеке добавлены.")
    }

    fun getName() = name
    fun getGender() = gender ?: throw IllegalStateException("Пол не установлен.")
}

enum class Gender {
    MALE,
    FEMALE,
}

fun chooseGender(): Gender {
    while (true) {
        print("Введите пол: ")
        val genderString = readln().uppercase()
        when (genderString) {
            Gender.FEMALE.name -> return Gender.FEMALE
            Gender.MALE.name -> return Gender.MALE
            else -> println("Введено некорректное значение.")
        }
    }
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
        human.setHumanGender(chooseGender())
        humanList.add(human)
    }

    println("\nСписок человек в картотеке:")
    humanList.forEach {
        println("ФИО: ${it.getName()}; пол: ${it.getGender()}")
    }
}

