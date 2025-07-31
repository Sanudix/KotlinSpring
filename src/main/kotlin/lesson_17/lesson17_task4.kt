package org.example.lesson_17

class Package(
    private val packageNumber: Int,
    private var currentLocation: String,
) {
    private var counterMoving: Int = 0

    var newLocation: String
        get() = currentLocation
        set(value) {
            ++counterMoving
            println("Посылка прибыла из \"${currentLocation}\" в \"${value}\".\nТекущее кол-во перемещений: ${counterMoving}.")
            currentLocation = value
        }
}

fun main() {
    val package1 = Package(packageNumber = 100028, currentLocation = "Новгород")

    package1.newLocation = "Калиниград"
    package1.newLocation = "Сочи"
}