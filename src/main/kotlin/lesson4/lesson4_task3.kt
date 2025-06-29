package org.example.lesson4

const val NECESSARY_WEATHER = "солнечная"
const val NECESSARY_STATUS_OF_TENT = "открыт"
const val NECESSARY_AIR_HUMIDITY = 20
const val NECESSARY_SEASON = "зима"

fun main(){
    val currentWeather = "солнечная"
    val currentStatusOfTent = "открыт"
    val airHumidity = 20
    val currentSeason = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых?" +
            " ${(NECESSARY_WEATHER == currentWeather) and (NECESSARY_STATUS_OF_TENT == currentStatusOfTent) and (NECESSARY_AIR_HUMIDITY == airHumidity) and (NECESSARY_SEASON != currentSeason)}")
}
