package org.example.lesson_12

class Weather() {
    var dayTemperature = 20
    var nightTemperature = 10
    var isRain = false

    fun setData(dayTemperature: Int, nightTemperature: Int, isRain: Boolean) {
        this.dayTemperature = dayTemperature
        this.nightTemperature = nightTemperature
        this.isRain = isRain
    }

    fun printData() {
        println("Температура днем: $dayTemperature")
        println("Температура ночью: $nightTemperature")
        println("Наличие осадков: $isRain\n")
    }
}

fun main() {
    val weather1 = Weather()
    val weather2 = Weather()
    weather1.printData()
    weather2.printData()

    weather1.setData(30, 10, true)
    weather2.setData(0, -15, false)
    weather1.printData()
    weather2.printData()
}