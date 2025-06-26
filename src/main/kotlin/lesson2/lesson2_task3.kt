package org.example.lesson2

const val MINUTES_IN_HOUR = 60

fun main(){
    val departureHour: Int = 9
    val departureMinutes: Int = 39
    val minutesOnTheROad: Int = 457
    val arriveHour: Int
    val arriveMinutes: Int
    var tempMinutes: Int

    tempMinutes = minutesOnTheROad + departureMinutes + departureHour * MINUTES_IN_HOUR
    arriveHour = tempMinutes / MINUTES_IN_HOUR
    arriveMinutes = tempMinutes - arriveHour * MINUTES_IN_HOUR

    println("Время прибытия: ${arriveHour}:${arriveMinutes}")
}