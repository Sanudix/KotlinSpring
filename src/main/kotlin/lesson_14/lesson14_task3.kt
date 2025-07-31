package org.example.lesson_14

import kotlin.math.PI

abstract class Figure(
    val color: String,
) {
    abstract fun areaCalculating(): Double
    abstract fun perimeterCalculating(): Double
}

class Rectangle(
    color: String,
    val height: Int,
    val width: Int,
) : Figure(color) {
    override fun areaCalculating(): Double = (height * width).toDouble()
    override fun perimeterCalculating(): Double = ((height + width) * 2).toDouble()
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {
    override fun areaCalculating(): Double = (2 * radius * radius).toDouble()
    override fun perimeterCalculating(): Double = 2 * PI * radius
}

fun main() {
    val figure1 = Rectangle("black", 30, 80)
    val figure2 = Rectangle("white", 100, 80)
    val figure3 = Circle("white", 100)
    val figure4 = Circle("black", 20)

    val figures = mutableListOf(figure1, figure2, figure3, figure4)

    val blackFigures = figures.filter { it.color == "black" }
    val whiteFigures = figures.filter { it.color == "white" }

    val blackFiguresPerimeter = blackFigures.sumOf { it.perimeterCalculating() }
    val whiteFiguresArea = whiteFigures.sumOf { it.areaCalculating() }

    println(
        """Сумма площадей белых фигур: $whiteFiguresArea
        |Сумма периметров черных фигур: $blackFiguresPerimeter
    """.trimMargin()
    )
}