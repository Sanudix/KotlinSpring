package org.example.lesson_14

open class Liner(
    val name: String = "Liner",
    val liftingCapacity: Int = 1000,
    val passengerNumber: Int = 5000,
    val speed: Int = 50,
    val breakIceAbility: Boolean = false,
) {
    open fun paveTheWay() {
        println("Капитан проложил маршрут.")
    }

    fun startVoyage() {
        println("Корабль $name начал плаванье.")
    }

    open fun endVoyage() {
        println("Корабль прибыл в порт.\n")
    }
}

class Icebreaker(
    name: String,
    liftingCapacity: Int,
    passengerNumber: Int,
    speed: Int,
    breakIceAbility: Boolean,
    val nuclearReactorPower: Int,
) : Liner(name, liftingCapacity, passengerNumber, speed, breakIceAbility) {
    override fun paveTheWay() {
        println("Капитан проложил маршрут, учитывая лед на пути.")
    }

    fun convoyMission() {
        println("Корабль начал задания по сопровождению судна.")
    }
}

class CargoShip(
    name: String,
    liftingCapacity: Int,
    passengerNumber: Int,
    speed: Int,
    breakIceAbility: Boolean,
    val typeOfCargo: String,
) : Liner(name, liftingCapacity, passengerNumber, speed, breakIceAbility) {
    override fun endVoyage() {
        println("Корабль прибыл в грузовой порт.")
    }

    fun loadingOfCargo() {
        println("Выполнена погрузка груза на судно.")
    }
}

fun main() {
    val ship1 = Liner()
    ship1.paveTheWay()
    ship1.startVoyage()
    ship1.endVoyage()

    val ship2 = Icebreaker("Ice", 700, 900, 45, true, 55)
    ship2.paveTheWay()
    ship2.startVoyage()
    ship2.convoyMission()
    ship2.endVoyage()

    val ship3 = CargoShip("Grozny", 1500, 200, 40, false, "Топливо")
    ship3.paveTheWay()
    ship3.loadingOfCargo()
    ship3.startVoyage()
    ship3.endVoyage()
}