package org.example.lesson_9

fun main() {
    val listOfIngredient = mutableListOf<String>()

    println("Введите 5 ингредиентов ниже.")
    while (listOfIngredient.size < 5) {
        val userInput = readln()
        if (userInput !in listOfIngredient) {
            listOfIngredient.add(userInput)
        } else {
            println("Этот ингредиент уже добавлен!")
        }
    }
    listOfIngredient.sortBy { it.lowercase() }

    val formattedOutput = buildString {
        listOfIngredient.forEachIndexed { index, ingredient ->
            when (index) {
                0 -> append(ingredient.lowercase().replaceFirstChar { it.uppercase() })
                else -> append(", ${ingredient.lowercase()}")
            }
        }
    }
    println("Список ингредиентов: $formattedOutput")
}