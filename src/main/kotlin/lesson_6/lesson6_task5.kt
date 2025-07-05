package org.example.lesson5

import kotlin.random.Random

fun main(){
    var firstOperand: Int
    var secondOperand: Int
    var resultOfExercise: Int
    var countOfTries = 3

    print("Вы находитесь на странице входа в аккаунт.\n" +
            "Сперва докажите, что вы не робот. Для этого решите простой пример.\n")

    do {
        firstOperand = Random.nextInt(1, 9)
        secondOperand = Random.nextInt(1, 9)
        resultOfExercise = firstOperand + secondOperand

        print("У вас ${countOfTries--} попытки. $firstOperand + $secondOperand = ")
        var userResultOfExercise = readln().toInt()

        if (userResultOfExercise == resultOfExercise) {
            println("Доступ разрешен.")
            return
        } else if(countOfTries == 0){
            println("Доступ запрещен.")
            break
        }
    } while(userResultOfExercise != resultOfExercise)
}