package org.example.lesson_17

class Ship(name: String) {
    var name: String = "Линкор"
        get() = field
        set(newName) {
            println("Имя корабля менять нельзя.")
        }
    var avgSpeed: Int = 10
        get() = field
        set(newSpeed) {
            field = newSpeed
            println("Скорость изменена.")
        }
    var seaport: String = "Лондон"
        get() = field
        set(newSeaport) {
            field = newSeaport
            println("Порт изменен.")
        }
}

fun main() {
    val ship1 = Ship("Тральщик")

    ship1.avgSpeed = 30
    ship1.seaport = "Владивосток"
    ship1.name = "Эсминец"
}