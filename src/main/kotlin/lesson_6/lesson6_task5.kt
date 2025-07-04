package org.example.lesson5

import kotlin.random.Random

fun main(){
    var firstOperand = Random.nextInt(1, 9)
    var secondOperand = Random.nextInt(1, 9)
    var resultOfExercise = firstOperand + secondOperand
    var countOfTries = 3

    print("Вы находитесь на странице входа в аккаунт.\n" +
            "Сперва докажите, что вы не робот. Для этого решите простой пример.\n" +
            "У вас $countOfTries попытки. $firstOperand + $secondOperand = ")
    var userResultOfExercise = readln().toInt()
    countOfTries--

    if(userResultOfExercise == resultOfExercise){
        println("Доступ разрешен.")
    } else {
        do {
            firstOperand = Random.nextInt(1, 9)
            secondOperand = Random.nextInt(1, 9)
            resultOfExercise = firstOperand + secondOperand

            print("Ошибка. У вас $countOfTries попытки. Решите новый пример: $firstOperand + $secondOperand = ")
            userResultOfExercise = readln().toInt()
            countOfTries--

            if (countOfTries == 0) {
                println("Доступ запрещен.")
                break
            } else if(userResultOfExercise == resultOfExercise){
                println("Доступ разрешен.")
            }
        }
        while(userResultOfExercise != resultOfExercise)
    }
}