package org.example.lesson_8

fun main() {
    val recipeOfChicken =
        arrayOf("курица", "молоко", "яйца", "сыр", "масло", "соль", "черный перец", "панировочные сухари")
    recipeOfChicken.forEachIndexed { index, ingredient ->
        println("${index + 1}. $ingredient")
    }

    print("\nВведите номер ингредиента, который нужно заменить: ")
    val numberOfIngredient = readln().toInt() - 1
    if (numberOfIngredient >= 0 && numberOfIngredient < recipeOfChicken.size) {
        print("Введите название нового ингредиента: ")
        val newIngredient = readln()
        recipeOfChicken[numberOfIngredient] = newIngredient

        println("\nГотово! Вы сохранили следующий список:")
        recipeOfChicken.forEachIndexed { index, ingredient ->
            println("${index + 1}. $ingredient")
        }
    } else {
        println("Такого ингредиента нет.")
    }
}