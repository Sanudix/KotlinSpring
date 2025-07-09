package org.example.lesson_9

fun main() {
    val listOfAmountOfIngredient = listOf(2, 50, 15)

    print("Введите количество порций: ")
    val numberOfPortion = readln().toInt()
    val newListOfAmountOfIngredient = listOfAmountOfIngredient.map {
        it * numberOfPortion
    }

    println(
        "На $numberOfPortion порций вам понадобится:\nЯиц - ${newListOfAmountOfIngredient[0]} шт" +
                "\nмолока - ${newListOfAmountOfIngredient[1]} мл\nсливочного масла - ${newListOfAmountOfIngredient[2]} гр")
}