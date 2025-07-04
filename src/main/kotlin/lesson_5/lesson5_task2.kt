package org.example.lesson5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2025

fun main(){
    print("Введите ваш год рождения: ")
    val birthYear = readln().toInt()
    val userAge = CURRENT_YEAR - birthYear

    if(userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом.")
    } else {
        println("Вернуться на основной экран.")
    }
}