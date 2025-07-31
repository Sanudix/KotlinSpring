package org.example.lesson_12

const val KELVIN_DIFFERENCE = 273

class DayWeather(_dayTemperature: Int, _nightTemperature: Int, _isRain: Boolean) {
    val dayTemperature: Int = _dayTemperature - KELVIN_DIFFERENCE
    val nightTemperature: Int = _nightTemperature - KELVIN_DIFFERENCE
    val isRain: Boolean = _isRain

    init {
        println("Температура днем: $dayTemperature C")
        println("Температура ночью: $nightTemperature C")
        println("Наличие осадков: $isRain\n")
    }
}

fun main() {
    val weather = DayWeather(308, 290, true)
}