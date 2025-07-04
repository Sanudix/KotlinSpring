package org.example.lesson2

const val MINUTES_IN_HOUR = 60

fun main(){
    val departureHour: Int = 9
    val departureMinutes: Int = 39
    val minutesOnTheRoad: Int = 457

    val tempMinutes: Int = minutesOnTheRoad + departureMinutes + departureHour * MINUTES_IN_HOUR
    val arriveHour: Int = tempMinutes / MINUTES_IN_HOUR
    val arriveMinutes: Int = tempMinutes - arriveHour * MINUTES_IN_HOUR

    println("Время прибытия: ${arriveHour}:${arriveMinutes}")
}