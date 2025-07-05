package org.example.lesson_7

fun main() {
    print("Введите количество секунд, которые нужно засечь: ")
    val seconds = readln().toInt()

    for (i in seconds downTo 1) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)
    }
    println("Время вышло.")
}