package org.example.lesson_12

import kotlin.random.Random

const val KELVIN_DIFFERENCE = 273
const val DAYS_IN_MONTH = 30

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
    val monthlyWeather = mutableListOf<DayWeather>()

    for (i in 0 until DAYS_IN_MONTH) {
        val weather = DayWeather(
            Random.nextInt(273, 311),
            Random.nextInt(260, 300), Random.nextBoolean()
        )
        monthlyWeather.add(weather)
    }

    val dayTemperatures = monthlyWeather.map { it.dayTemperature }
    val nightTemperatures = monthlyWeather.map { it.nightTemperature }
    val rainyDays = monthlyWeather.count { it.isRain }

    val avgDayTemperature = dayTemperatures.average()
    val avgNightTemperature = nightTemperatures.average()

    println("Количество дождливых дней: $rainyDays")
    println("Средняя дневная температура: $avgDayTemperature")
    println("Средняя ночная температура: $avgNightTemperature")
}