package org.example.lesson_22

import java.time.LocalDateTime

fun main() {
    val alphaCentauri = GalacticGuide(
        "Alpha Centauri",
        "A triple star system in the constellation Centaurus. The last star was discovered in 1915.",
        LocalDateTime.of(1915, 10, 10, 10, 10),
        4.3f
    )

    println("Добро пожаловать в звездный путеводитель!\n")
    println("Название: ${alphaCentauri.component1()}")
    println("Описание: ${alphaCentauri.component2()}")
    println("Дата открытия: ${alphaCentauri.component3()}")
    println("Расстояние от Земли: ${alphaCentauri.component4()} световых лет")
    println()
}

data class GalacticGuide(
    val title: String,
    val description: String,
    val date: LocalDateTime,
    val distance: Float,
)