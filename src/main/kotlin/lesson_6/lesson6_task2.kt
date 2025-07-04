package org.example.lesson_6

fun main(){
    print("Введите количество секунд, которые нужно засечь: ")
    val seconds = readln().toInt()
    val milliseconds = seconds * 1000L

    Thread.sleep(milliseconds)
    println("Прошло $seconds секунд.")
}