package org.example.lesson_15

interface FloatingCreatures {
    fun swimUnderWater() {
        println("Умеет плавать под водой.")
    }

    fun swimOnWater() {
        println("Умеет плавать на воде.")
    }
}

interface FlyingCreatures {
    fun wavingFlight() {
        println("Умеет летать, используя машущий полет.")
    }

    fun soaringFlight() {
        println("Умеет летать, используя парящий полет.")
    }

    fun swoops() {
        println("Умеет пикировать.")
    }
}


class Crucian : FloatingCreatures {
    override fun swimUnderWater() {
        println("\nКарась умеет плавать под водой.")
    }
}

open class Seagull : FlyingCreatures, FloatingCreatures {
    override fun wavingFlight() {
        print("\nЧайка умеет: летать, используя машущий полет, ")
    }

    override fun soaringFlight() {
        print("парящий полет, ")
    }

    override fun swoops() {
        print("может пикировать, ")
    }

    override fun swimOnWater() {
        print("способна плавать на воде, ")
    }

    override fun swimUnderWater() {
        print("способна нырнуть под воду.")
    }
}

class Duck : Seagull() {
    override fun wavingFlight() {
        print("\nУтка умеет: летать, используя машущий полет, ")
    }

    override fun swimOnWater() {
        print("плавать на воде, ")
    }

    override fun swimUnderWater() {
        print("длительно плавать под подой.")
    }
}

fun main() {
    val duck = Duck()
    val seagull = Seagull()
    val crucian = Crucian()

    seagull.wavingFlight()
    seagull.soaringFlight()
    seagull.swoops()
    seagull.swimOnWater()
    seagull.swimUnderWater()

    duck.wavingFlight()
    duck.swimOnWater()
    duck.swimUnderWater()

    crucian.swimUnderWater()
}