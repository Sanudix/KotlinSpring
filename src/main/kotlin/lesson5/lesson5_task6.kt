package org.example.lesson5

import kotlin.math.pow

const val CENTIMETERS_IN_METER = 100
const val UNDERWEIGHT_INDEX = 18.5
const val NORMAL_WEIGHT_INDEX = 25
const val OVERWEIGHT_INDEX = 30

fun main(){
    print("Введите ваш вес (в килограммах): ")
    val weightOfUser = readln().toFloat()
    print("Введите ваш рост (в сантиметрах): ")
    val heightOfUser = readln().toFloat()

    val heightConvertToMeter = heightOfUser / CENTIMETERS_IN_METER
    val indexOfBodyMass = weightOfUser / heightConvertToMeter.pow(2)

    if (indexOfBodyMass < UNDERWEIGHT_INDEX)
        println("Недостаточная масса тела.")
    else if (UNDERWEIGHT_INDEX <= indexOfBodyMass && indexOfBodyMass < NORMAL_WEIGHT_INDEX)
        println("Нормальная масса тела.")
    else if (NORMAL_WEIGHT_INDEX <= indexOfBodyMass && indexOfBodyMass < OVERWEIGHT_INDEX)
        println("Избыточная масса тела.")
    else
        println("Ожирение.")

    println("Ваш ИМТ = " + "%.2f".format(indexOfBodyMass))
}