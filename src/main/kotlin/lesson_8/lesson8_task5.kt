package org.example.lesson_8

fun main() {
    print("Введите количество ингредиентов в рецепте: ")
    val countOfIngredients = readln().toInt()
    val arrayOfIngredients = Array<String>(countOfIngredients) { "" }
    println("Введите названия ингредиентов.")

    for (i in 0 until arrayOfIngredients.size) {
        print("Ингредиент ${i + 1}: ")
        arrayOfIngredients[i] = readln()
    }

    println(arrayOfIngredients.joinToString(", ") + ".")
}