package org.example.lesson_8

fun main() {
    var numberOfIngredient: Int
    var newIngredient: String
    var counter = 1
    val recipeOfChicken = arrayOf("курица", "молоко", "яйца", "сыр", "масло", "соль", "черный перец", "панировочные сухари")
    for (i in recipeOfChicken) {
        println("Ингредиент номер ${counter++}: $i")
    }

    do {
        print("\nВведите номер ингредиента, который нужно заменить: ")
        numberOfIngredient = readln().toInt() - 1
        print("Введите название нового ингредиента: ")
        newIngredient = readln()
        recipeOfChicken[numberOfIngredient] = newIngredient
    } while (numberOfIngredient < 1 || numberOfIngredient > recipeOfChicken.size)

    println("\nГотово! Вы сохранили следующий список:")
    counter = 1
    for (i in recipeOfChicken) {
        println("Ингредиент номер ${counter++}: $i")
    }
}