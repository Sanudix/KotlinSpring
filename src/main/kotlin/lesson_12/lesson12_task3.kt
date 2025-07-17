package org.example.lesson_12

class DayWeather(_dayTemperature: Int, _nightTemperature: Int, _isRain: Boolean) {
    var dayTemperature: Int = _dayTemperature - 273
    var nightTemperature: Int = _nightTemperature - 273
    var isRain: Boolean = _isRain

    fun printData() {
        println("Температура днем: $dayTemperature C")
        println("Температура ночью: $nightTemperature C")
        println("Наличие осадков: $isRain\n")
    }
}

fun main() {
    val weather = DayWeather(300, 290, true)
    weather.printData()
}