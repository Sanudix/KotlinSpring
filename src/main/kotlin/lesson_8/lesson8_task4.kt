package org.example.lesson_8

fun main() {
    var counter = 1
    val recipeOfChicken =
        arrayOf("курица", "молоко", "яйца", "сыр", "масло", "соль", "черный перец", "панировочные сухари")
    recipeOfChicken.forEachIndexed { index, ingredient ->
        println("${index + 1}. $ingredient")
    }

    print("\nВведите номер ингредиента, который нужно заменить: ")
    var numberOfIngredient = readln().toInt() - 1
    if (numberOfIngredient >= 1 && numberOfIngredient <= recipeOfChicken.size) {
        print("Введите название нового ингредиента: ")
        var newIngredient = readln()
        recipeOfChicken[numberOfIngredient] = newIngredient

        println("\nГотово! Вы сохранили следующий список:")
        recipeOfChicken.forEachIndexed { index, ingredient ->
            println("${index + 1}. $ingredient")
        }
    } else {
        println("Такого ингредиента нет.")
    }
}