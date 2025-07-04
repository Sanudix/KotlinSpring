package org.example.lesson_6

fun main(){
    print("Введите количество секунд, которые нужно засечь: ")
    var seconds = readln().toInt()
    var milliseconds: Long

    while(seconds > 0){
        println("Осталось секунд: ${seconds--}")
        Thread.sleep(1000)
    }
    println("Время вышло.")
}