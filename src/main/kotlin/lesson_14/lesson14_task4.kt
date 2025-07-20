package org.example.lesson_14

abstract class CelestialBody(
    val name: String,
    val radius: Int,
    val weight: Long,
    val atmospherePresence: Boolean,
    val feasibilityOfLanding: Boolean,
) {
    abstract fun printName()

}

class Planet(
    name: String,
    radius: Int,
    weight: Long,
    atmospherePresence: Boolean,
    feasibilityOfLanding: Boolean,
    val listOfSatellites: MutableList<Satellite>,
) : CelestialBody(name, radius, weight, atmospherePresence, feasibilityOfLanding) {
    override fun printName() {
        println("Название планеты: $name")
    }
}

class Satellite(
    name: String,
    radius: Int,
    weight: Long,
    atmospherePresence: Boolean,
    feasibilityOfLanding: Boolean,
    val surfaceTemperature: Int,
) : CelestialBody(name, radius, weight, atmospherePresence, feasibilityOfLanding) {
    override fun printName() {
        println("Название спутника: $name")
    }
}

fun main() {
    val satellite1 = Satellite("Фобос", 11, 1070000000, false, false, -40)
    val satellite2 = Satellite("Деймос", 12, 148000000, false, false, -40)
    val satellites = mutableListOf(satellite1, satellite2)
    val planet = Planet("Марс", 3390, 64200000000000000, true, true, satellites)

    planet.printName()
    planet.listOfSatellites.forEach { it.printName() }
}