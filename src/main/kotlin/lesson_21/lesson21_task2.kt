package org.example.lesson_21

fun main() {
    val numberList = listOf(1, 2, 3, 10)

    println("Список чисел: $numberList")
    println("Сумма четных чисел списка: ${numberList.evenNumbersSum(numberList)}")
}

fun List<Int>.evenNumbersSum(_numberList: List<Int>): Int {
    var sumEvenNumber: Int = 0
    val evenNumberList = mutableListOf<Int>()

    for (number in _numberList) {
        if (number % 2 == 0) {
            sumEvenNumber += number
        }
    }

    return sumEvenNumber
}