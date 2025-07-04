package org.example.leeson_6

import kotlin.random.Random

fun main(){
    val secretNumber = Random.nextInt(1, 9)
    val numberOfTries = 5
    var inputNumber: Int

    println("Загадано число от 1 до 9. Вам необходимо его угадать.")
    while(numberOfTries > 0){
        print("Введите число: ")
        inputNumber = readln().toInt()
        if (inputNumber == secretNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Попробуйте еще раз!")
        }
    }
    println("Было загадано число $secretNumber.")
}