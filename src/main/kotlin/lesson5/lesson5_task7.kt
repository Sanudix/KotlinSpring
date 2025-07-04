package org.example.lesson5

const val HUNDRED = 100

fun main(){
    print("Введите расстояние поездки (в километрах): ")
    val distance = readln().toFloat()
    print("Введите расход топлива на 100 км (в литрах): ")
    val fuelConsumption = readln().toFloat()
    print("Введите текущую цену за литр топлива: ")
    val fuelPrice = readln().toFloat()

    val amountOfFuel = (distance * fuelConsumption) / HUNDRED
    val costOfTrip = amountOfFuel * fuelPrice

    println("Количество необходимого топлива: $amountOfFuel\n" +
            "Итоговая стоимость поездки: %.2f".format(costOfTrip))
}