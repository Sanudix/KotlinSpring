package org.example.lesson_9

fun main() {
    val listOfIngredients = listOf("лук", "курица", "перец", "соль")

    println("В рецепте есть следующие ингредиенты:")
    listOfIngredients.forEach { ingredient: String ->
        println(ingredient)
    }
}