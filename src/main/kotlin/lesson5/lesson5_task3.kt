package org.example.lesson5

fun main(){
    val firstWinValue = 8
    val secondWinValue = 34

    println("Для победы в лотерее нужно угадать два числа от 0 до 42.")
    print("Введите первое число: ")
    val firstUserValue = readln().toInt()
    print("Введите второе число: ")
    val secondUserValue = readln().toInt()

    if ((firstUserValue == firstWinValue || firstUserValue == secondWinValue) && (secondUserValue == firstWinValue || secondUserValue == secondWinValue)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if((firstUserValue == firstWinValue || firstUserValue == secondWinValue) || (secondUserValue == firstWinValue || secondUserValue == secondWinValue)) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
}