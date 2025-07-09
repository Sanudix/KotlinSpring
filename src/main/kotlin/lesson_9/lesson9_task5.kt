package org.example.lesson_9

fun main() {
    val setOfIngredient = mutableSetOf<String>()

    println("Введите 5 ингредиентов ниже.")
    while (setOfIngredient.size < 5) {
        val userInput = readln()
        if (!setOfIngredient.add(userInput)) {
            println("Этот ингредиент уже добавлен!")
        }
    }
    val sortSetOfIngredient =  setOfIngredient.sortedBy { it.lowercase() }

    val formattedOutput = sortSetOfIngredient.joinToString(", ").replaceFirstChar { it.uppercase() }
    println("Список ингредиентов: $formattedOutput")
}