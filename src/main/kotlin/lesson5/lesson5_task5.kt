package org.example.lesson5
import kotlin.random.Random

fun main(){
    val firstRandomValue = Random.nextInt(0, 42)
    val secondRandomValue = Random.nextInt(0, 42)
    val thirdRandomValue = Random.nextInt(0, 42)
    val listOfGeneratedValues = listOf(firstRandomValue, secondRandomValue, thirdRandomValue)
    println(listOfGeneratedValues)
    val sizeOfList = listOfGeneratedValues.size


    print("Введите первое число: ")
    val firstUserValue = readln().toInt()
    print("Введите второе число: ")
    val secondUserValue = readln().toInt()
    print("Введите третье число: ")
    val thirdUserValue = readln().toInt()
    val listOfUserValues = listOf(firstUserValue, secondUserValue, thirdUserValue)

    val intersection = listOfUserValues intersect listOfGeneratedValues
    val countOfIntersection = intersection.size

    if (countOfIntersection == 3)
        println("Вы выиграли джекпот!")
    else if (countOfIntersection == 2)
        println("Вы угадали 2 числа и получаете крупный приз!")
    else if (countOfIntersection == 1)
        println("Вы угадали 1 число и получаете утешительный приз!")
    else
        println("Вы не угадали ни одного числа.")
    println("Выигрышные числа: $listOfGeneratedValues.")
}