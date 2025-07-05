package org.example.lesson_7

fun main() {
    print("Введите число, до которого определятся все четные числа: ")
    val inputNumber = readln().toInt()

    for (i in 0..inputNumber step 2) {
        println("Четные числа от 0 до $inputNumber: $i")
    }
}