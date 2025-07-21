package org.example.lesson_15

interface FloatingCreatures {
    fun swimUnderWater()
    fun swimOnWater()
}

interface FlyingCreatures {
    fun wavingFlight()
    fun soaringFlight()
    fun swoops()
}


class Crucian : FloatingCreatures {
    override fun swimUnderWater() {
        println("Карась плавает только под водой.")
    }

    override fun swimOnWater() {
        println("По поверхности воды передвигаться не может.")
    }
}

open class Seagull : FlyingCreatures {
    override fun wavingFlight() {
        println(
            "Чайка способна передвигаться с помощью взмахов крыльев." +
                    " Особенность чайки - способность в машущем полета застывать на одной точке."
        )
    }

    override fun soaringFlight() {
        println("Чайка может парить на сильных потоках воздуха рядом с морем.")
    }

    override fun swoops() {
        println("При охоте чайка может пикировать.")
    }
}

class Duck : Seagull() {
    override fun wavingFlight() {
        println("Утка передвигается только с помощью взмахов крыльев.")
    }
}

fun main() {
    val duck = Duck()
    val seagull = Seagull()
    val crucian = Crucian()

    duck.wavingFlight()
    seagull.wavingFlight()
    seagull.soaringFlight()
    seagull.swoops()
    crucian.swimUnderWater()
    crucian.swimOnWater()
}