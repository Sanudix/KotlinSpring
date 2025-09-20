package org.example.lesson_21

fun main() {
    val numberList = listOf(1, 2, 3, 10)

    println("Список чисел: $numberList")
    println("Сумма четных чисел списка: ${numberList.evenNumbersSum()}")
}

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}