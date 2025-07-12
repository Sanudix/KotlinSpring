package org.example.lesson_12

class DayWeather(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var isRain: Boolean,
) {
    fun printData() {
        println("Температура днем: $dayTemperature")
        println("Температура ночью: $nightTemperature")
        println("Наличие осадков: $isRain\n")
    }
}

fun main() {
    val weather1 = DayWeather(30, 10, true)
    val weather2 = DayWeather(0, -15, false)

    weather1.printData()
    weather2.printData()
}