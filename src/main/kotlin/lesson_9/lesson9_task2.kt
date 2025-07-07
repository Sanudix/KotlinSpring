package org.example.lesson_9

fun main() {
    val listOfIngredients = mutableListOf("шоколад", "молоко", "сахар")

    println("В рецепте есть базовые ингредиенты:")
    println(listOfIngredients.joinToString(", ") + ".\n")
    print("Желаете добавить еще?\nда/нет: ")
    val userInput = readln()

    when {
        userInput.equals("да", ignoreCase = true) -> {
            print("Какой ингредиент вы хотите добавить?\nВведите: ")
            val newIngredient = readln()
            listOfIngredients.add(newIngredient)
        }

        else -> {
            println("Программа завершила работу.")
            return
        }
    }

    println("\nТеперь в рецепте есть следующие ингредиенты:")
    println(listOfIngredients.joinToString(", ") + ".")
}