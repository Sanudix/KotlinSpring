package org.example.lesson_14

open class Ship(
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

    fun linerLoading() {
        println("При погрузке был выдвинут горизонтальный трап со шкафута")
    }

    open fun printInfo() {
        println("""Корабль $name обладает следующими характеристиками:
            |Грузоподъемность: $liftingCapacity (тонн)
            |Вместительность: $passengerNumber (пассажиров) 
            |Скорость хода: $speed (морских миль / час)
            |Способность преодолевать ледяные преграды: $breakIceAbility
            |---
        """.trimMargin())
    }
}

class IceBreaker(
    name: String,
    liftingCapacity: Int,
    passengerNumber: Int,
    speed: Int,
    breakIceAbility: Boolean,
    val nuclearReactorPower: Int,
) : Ship(name, liftingCapacity, passengerNumber, speed, breakIceAbility) {
    override fun paveTheWay() {
        println("Капитан проложил маршрут, учитывая лед на пути.")
    }

    fun convoyMission() {
        println("Корабль начал задания по сопровождению судна.")
    }

    fun icebreakerLoading() {
        println("Для погрузки был использован погрузочный кран.")
    }

    override fun printInfo() {
        println("""Корабль $name обладает следующими характеристиками:
            |Грузоподъемность: $liftingCapacity (тонн)
            |Вместительность: $passengerNumber (пассажиров) 
            |Скорость хода: $speed (морских миль / час)
            |Способность преодолевать ледяные преграды: $breakIceAbility
            |Мощность атомного реактора: $nuclearReactorPower (МВт)
            |---
        """.trimMargin())
    }
}

class Freighter(
    name: String,
    liftingCapacity: Int,
    passengerNumber: Int,
    speed: Int,
    breakIceAbility: Boolean,
    val typeOfCargo: String,
) : Ship(name, liftingCapacity, passengerNumber, speed, breakIceAbility) {
    override fun endVoyage() {
        println("Корабль прибыл в грузовой порт.")
    }

    fun loadingOfCargo() {
        println("Выполнена погрузка груза на судно.")
    }

    fun freighterLoading() {
        println("Для погрузки были открыты ворота со стороны кормы.")
    }

    override fun printInfo() {
        println("""Корабль $name обладает следующими характеристиками:
            |Грузоподъемность: $liftingCapacity (тонн)
            |Вместительность: $passengerNumber (пассажиров) 
            |Скорость хода: $speed (морских миль / час)
            |Способность преодолевать ледяные преграды: $breakIceAbility
            |Тип груза: $typeOfCargo
            |---
        """.trimMargin())
    }
}

fun main() {
    val ship1 = Ship()
    ship1.printInfo()
    ship1.paveTheWay()
    ship1.startVoyage()
    ship1.endVoyage()

    val ship2 = IceBreaker("Ice", 700, 900, 45, true, 55)
    ship2.printInfo()
    ship2.paveTheWay()
    ship2.startVoyage()
    ship2.convoyMission()
    ship2.endVoyage()

    val ship3 = Freighter("Grozny", 1500, 200, 40, false, "Топливо")
    ship3.printInfo()
    ship3.paveTheWay()
    ship3.loadingOfCargo()
    ship3.startVoyage()
    ship3.endVoyage()
}