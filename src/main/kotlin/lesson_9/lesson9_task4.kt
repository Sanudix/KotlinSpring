package org.example.lesson_9

fun main() {
    print("Введите 5 ингредиентов, записанных в строке через запятые:")
    val userInput = readln()

    val listOfIngredients = userInput.split(",").map { it.trim() }
    val sortedListOfIngredients = listOfIngredients.sorted()
    println(sortedListOfIngredients)
}