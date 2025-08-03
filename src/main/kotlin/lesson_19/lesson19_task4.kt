package org.example.lesson_19

enum class Patron(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(
    private val ammo: Int,
) {
    private lateinit var currentPatronType: Patron
    private var currentAmmo = ammo

    fun changePatronType() {
        println("Текущий типа снаряда: ${currentPatronType}.")
        println("Для смены типа снаряда введите соответствующее число.")
        when (currentPatronType) {
            Patron.BLUE -> {
                println("Зеленый - 1\nКрасный - 2")
                print("Ввод: ")
                val userInput = readln().toInt()
                when (userInput) {
                    1 -> currentPatronType = Patron.GREEN
                    2 -> currentPatronType = Patron.RED
                    else -> println("Введено некорректное значение. Тип снаряда не изменен.")
                }
                println("Тип снаряда изменен.")
            }

            Patron.GREEN -> {
                println("Синий - 1\nКрасный - 2")
                print("Ввод: ")
                val userInput = readln().toInt()
                when (userInput) {
                    1 -> currentPatronType = Patron.BLUE
                    2 -> currentPatronType = Patron.RED
                    else -> println("Введено некорректное значение. Тип снаряда не изменен.")
                }
                println("Тип снаряда изменен.")
            }

            Patron.RED -> {
                println("Зеленый - 1\nСиний - 2")
                print("Ввод: ")
                val userInput = readln().toInt()
                when (userInput) {
                    1 -> currentPatronType = Patron.GREEN
                    2 -> currentPatronType = Patron.BLUE
                    else -> println("Введено некорректное значение. Тип снаряда не изменен.")
                }
                println("Тип снаряда изменен.")
            }
        }
    }

    fun setPatronType() {
        println("Выберите тип снаряда для первого заряжания:")
        println("Синий - 1\nЗеленый - 2\nКрасный - 3")
        print("Ввод: ")
        val userInput = readln().toInt()
        when (userInput) {
            1 -> currentPatronType = Patron.BLUE
            2 -> currentPatronType = Patron.GREEN
            3 -> currentPatronType = Patron.RED
            else -> println("Заряжание не выполнено. Введите корректное значение.")
        }
    }

    fun shoot() {
        if (currentAmmo != 0) {
            currentAmmo--
            println("\nПроизведен выстрел. Нанесено: ${currentPatronType.damage} урона.\nОсталось снарядов: $currentAmmo.\n")
        } else {
            println("\nБоезапас пуст.\n")
        }
    }

    fun getPatronType() = currentPatronType
    fun getAmmo() = ammo
}

fun main() {
    val leopard = Tank(40)

    do {
        leopard.setPatronType()
    } while (leopard.getPatronType() != Patron.RED && leopard.getPatronType() != Patron.BLUE && leopard.getPatronType() != Patron.GREEN)

    leopard.shoot()
    leopard.changePatronType()
    leopard.shoot()
    leopard.changePatronType()
    leopard.shoot()

    for (i in 1..leopard.getAmmo()) {
        leopard.shoot()
    }
}