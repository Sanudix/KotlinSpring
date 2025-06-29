package org.example.lesson3

fun main(){
    val inputString = "D2-D4;0"
    val parts = inputString.split("-", ";")

    val(startPosition, endPosition, tempNumberOfMove) = parts
    val numberOfMove = tempNumberOfMove.toInt()

    println("Начальная позиция: $startPosition")
    println("Конечная позиция: $endPosition")
    println("Номер хода: $numberOfMove")
}