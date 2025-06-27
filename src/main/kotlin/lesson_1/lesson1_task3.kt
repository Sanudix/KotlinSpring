package org.example.lesson_1

fun main() {
    val yearOfRocketFlight: Int = 1961
    var hourOfRocketFlight: String = "09"
    var minuteOfRocketFlight: String = "07"
    println("Год полета: ${yearOfRocketFlight}" +
            "\nЧас взлета: ${hourOfRocketFlight}" +
            "\nМинута взлета: ${minuteOfRocketFlight}")

    hourOfRocketFlight = "10"
    minuteOfRocketFlight = "55"
    println("Время посадки: ${hourOfRocketFlight}:${minuteOfRocketFlight}")
}