package org.example.lesson5

fun main(){
    val firstOperand = 5
    val secondOperand = 12
    println("Для подтвеждения, что вы не бот, решите задачку: 5 + 12.")
    print("Ваш ответ: ")
    val answer = readln().toInt()
    if (answer == (firstOperand + secondOperand)) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}