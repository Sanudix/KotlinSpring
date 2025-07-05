package org.example.lesson_8

fun main() {
    val arrayAdViews: IntArray = IntArray(7)
    var sumOfViews: Int = 0
    println("Введите количество просмотров рекламы за неделю.")

    for (i in 0..6) {
        print("Просмотры в ${i + 1} день: ")
        arrayAdViews[i] = readln().toInt()
        sumOfViews += arrayAdViews[i]
    }
    println("Просмотров рекламы за неделю: $sumOfViews")
}