package org.example.lesson_15

const val MAX_PASSENGERS_IN_PASSENGERS_CAR = 3
const val MAX_PASSENGERS_COUNT_IN_TRUCK = 1
const val NUMBER_OF_PASSENGERS_IN_EMPTY_CAR = 0
const val CARGO_WEIGHT_IN_EMPTY_CAR = 0
const val MAX_CARGO_WEIGHT = 2

open class PassengerCar(
    val isTruck: Boolean,
    var passengerNumber: Int,
    val carBrand: String,
) : Movement, PassengerTransportation, CargoTransportation

class Truck(
    isTruck: Boolean,
    passengerNumber: Int,
    carBrand: String,
    var cargoWeight: Int,
) : PassengerCar(isTruck, passengerNumber, carBrand)


interface Movement {
    fun startMovement(brand: String) {
        println("Машина \"$brand\" начала движение.")
    }

    fun endMovement(brand: String) {
        println("Машина \"$brand\" прибыла на место назначения и припарковалась.")
    }
}

interface PassengerTransportation {
    fun passengersLoading(car: PassengerCar) {
        if (car.isTruck) {
            if (car.passengerNumber == MAX_PASSENGERS_COUNT_IN_TRUCK)
                println("${car.passengerNumber} пассажир сел в машину \"${car.carBrand}\". Мест больше нет.")
            else if (car.passengerNumber < MAX_PASSENGERS_COUNT_IN_TRUCK)
                println("Пассажиров нет.")
            else
                println("Пассажиров слишком много. $MAX_PASSENGERS_COUNT_IN_TRUCK поехал в машине \"${car.carBrand}\", ${car.passengerNumber - MAX_PASSENGERS_COUNT_IN_TRUCK} остались ждать, когда их заберут.")
        } else {
            if (car.passengerNumber <= MAX_PASSENGERS_IN_PASSENGERS_CAR && car.passengerNumber > NUMBER_OF_PASSENGERS_IN_EMPTY_CAR) {
                println("${car.passengerNumber} пассажира(пассажир) сели(сел) в машину \"${car.carBrand}\".")
            } else if (car.passengerNumber < NUMBER_OF_PASSENGERS_IN_EMPTY_CAR) {
                println("Пассажиров нет.")
            } else {
                println("Пассажиров слишком много. $MAX_PASSENGERS_IN_PASSENGERS_CAR поехал в машине \"${car.carBrand}\", ${car.passengerNumber - MAX_PASSENGERS_IN_PASSENGERS_CAR} остались ждать, когда их заберут.")
            }
        }
    }

    fun passengersUnloading(car: PassengerCar): Int {
        if (car.isTruck) {
            if (car.passengerNumber == MAX_PASSENGERS_COUNT_IN_TRUCK) {
                println("${car.passengerNumber} пассажир прибыл на место.")
                return car.passengerNumber
            } else if (car.passengerNumber < MAX_PASSENGERS_COUNT_IN_TRUCK) {
                println("Пассажиров не было.")
                return NUMBER_OF_PASSENGERS_IN_EMPTY_CAR
            } else {
                println("Пассажиров слишком много. Только $MAX_PASSENGERS_COUNT_IN_TRUCK приехал на машине \"${car.carBrand}\".")
                return MAX_PASSENGERS_COUNT_IN_TRUCK
            }
        } else {
            if (car.passengerNumber <= MAX_PASSENGERS_IN_PASSENGERS_CAR && car.passengerNumber > NUMBER_OF_PASSENGERS_IN_EMPTY_CAR) {
                println("${car.passengerNumber} пассажир(пассажира) прибыл(прибыли) на место.")
                return car.passengerNumber
            } else if (car.passengerNumber < NUMBER_OF_PASSENGERS_IN_EMPTY_CAR) {
                println("Пассажиров не было.")
                return NUMBER_OF_PASSENGERS_IN_EMPTY_CAR
            } else {
                println("Пассажиров слишком много. $MAX_PASSENGERS_IN_PASSENGERS_CAR прибыли на место.")
                return MAX_PASSENGERS_IN_PASSENGERS_CAR
            }
        }
    }
}

interface CargoTransportation {
    fun cargoLoading(truck: Truck) {
        if (truck.cargoWeight <= MAX_CARGO_WEIGHT && truck.cargoWeight > CARGO_WEIGHT_IN_EMPTY_CAR)
            println("${truck.cargoWeight} тонны(тонна) загружены(загружена).")
        else if (truck.cargoWeight <= CARGO_WEIGHT_IN_EMPTY_CAR)
            println("Груза нет.")
        else
            println("Груза слишком много. $MAX_CARGO_WEIGHT тонны(тонна) погружено(погружена) в машину \"${truck.carBrand}\", ${truck.cargoWeight - MAX_CARGO_WEIGHT} тонна(тонны) осталась(остались) на складе.")
    }

    fun cargoUnloading(truck: Truck): Int {
        if (truck.cargoWeight <= MAX_CARGO_WEIGHT && truck.cargoWeight > CARGO_WEIGHT_IN_EMPTY_CAR) {
            println("${truck.cargoWeight} тонны(тонна) груза доставлено.")
            return truck.cargoWeight
        } else if (truck.cargoWeight <= CARGO_WEIGHT_IN_EMPTY_CAR) {
            println("Груза не было.")
            return CARGO_WEIGHT_IN_EMPTY_CAR
        } else {
            println("Груза слишком много. $MAX_CARGO_WEIGHT тонны(тонна) доставлено на место, ${truck.cargoWeight - MAX_CARGO_WEIGHT} тонны(тонна) остались(осталась) на складе.")
            return MAX_CARGO_WEIGHT
        }
    }
}

fun main() {
    val car1 = PassengerCar(false, 3, "Toyota")
    val car2 = PassengerCar(false, 2, "Ford")
    val truck1 = Truck(true, 3, "Nissan", 3)

    var passengerNumber = 0
    var cargoWeight = 0

    car1.passengersLoading(car1)
    car2.passengersLoading(car2)
    truck1.passengersLoading(truck1)
    truck1.cargoLoading(truck1)

    car1.startMovement(car1.carBrand)
    car2.startMovement(car2.carBrand)
    truck1.startMovement(truck1.carBrand)

    car1.endMovement(car1.carBrand)
    car2.endMovement(car2.carBrand)
    truck1.endMovement(truck1.carBrand)

    passengerNumber += car1.passengersUnloading(car1)
    passengerNumber += car2.passengersUnloading(car2)
    passengerNumber += truck1.passengersUnloading(truck1)
    cargoWeight += truck1.cargoUnloading(truck1)

    println("\nИтого было перевезено: $passengerNumber пассажиров, $cargoWeight тонны груза.")
}