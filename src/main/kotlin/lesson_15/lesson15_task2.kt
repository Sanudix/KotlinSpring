package org.example.lesson_15

abstract class WeatherStationStats(
    val value: Int,
    val day: Int,
    val month: Int,
    val year: Int,
    val hour: Int,
)

class Temperature(
    value: Int,
    day: Int,
    month: Int,
    year: Int,
    hour: Int,
) : WeatherStationStats(value, day, month, year, hour) {}

class PrecipitationAmount(
    value: Int,
    day: Int,
    month: Int,
    year: Int,
    hour: Int,
) : WeatherStationStats(value, day, month, year, hour) {}

class WeatherServer() {
    fun sendMessage(instance: WeatherStationStats) {
        if (instance is Temperature) {
            println(
                "Температура на ${instance.day}.${"%02d".format(instance.month)}.${instance.year}" +
                        " в ${instance.hour} час(часов): ${instance.value} C"
            )
        } else {
            println(
                "Количество осадков на ${instance.day}.${"%02d".format(instance.month)}.${instance.year}" +
                        " в ${instance.hour} час(часов): ${instance.value} мм"
            )
        }
    }
}

fun main() {
    val temperature = Temperature(24, 21, 7, 2025, 18)
    val precipation = PrecipitationAmount(11, 21, 7, 2025, 18)

    val server = WeatherServer()
    server.sendMessage(temperature)
    server.sendMessage(precipation)
}