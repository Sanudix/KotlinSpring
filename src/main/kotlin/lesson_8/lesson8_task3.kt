package org.example.lesson_8

fun main() {
    val recipeOfChicken = arrayOf("курица", "молоко", "яйца", "сыр", "масло", "соль", "черный перец", "панировочные сухари")
    print("Введите название интересующего ингредиента: ")
    val nameOfIngredient = readln()

    if(recipeOfChicken.indexOf(nameOfIngredient) >= 0){
        println("Ингредиент $nameOfIngredient в рецепте есть.")
        return
    } else {
        println("Такого ингредиента в рецепте нет.")
    }
}