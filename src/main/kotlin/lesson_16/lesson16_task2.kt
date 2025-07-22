package org.example.lesson_16

import kotlin.math.pow

private const val PI_VALUE = 3.14

class Circle(
    private val radius: Double,
) {
    fun areaCalculate() {
        val area = radius.pow(2.0) * PI_VALUE
        println("Значение площади: $area")
    }

    fun circleLength() {
        val perimeter = 2 * PI_VALUE * radius
        println("Значение длины окружности: $perimeter")
    }
}

fun main() {
    val circle1 = Circle(3.0)
    circle1.areaCalculate()
    circle1.circleLength()
}