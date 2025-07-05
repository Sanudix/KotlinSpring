package org.example.lesson_8

fun main() {
    val recipeOfChicken =
        arrayOf("курица", "молоко", "яйца", "сыр", "масло", "соль", "черный перец", "панировочные сухари")
    print("Введите название интересующего ингредиента: ")
    val nameOfIngredient = readln()
    var flag: Boolean = false

    for (i in recipeOfChicken) {
        if (nameOfIngredient == i) {
            println("Ингредиент $nameOfIngredient в рецепте есть.")
            return
        }
    }
    println("Такого ингредиента в рецепте нет.")
}