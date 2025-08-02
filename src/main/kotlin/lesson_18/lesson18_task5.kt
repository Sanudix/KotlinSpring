package org.example.lesson_18

class Screen {
    fun draw(x1: Int, y1: Int): String {
        return "Точка с координатами - x = $x1, y = $y1"
    }

    fun draw(x1: Float, y1: Float): String {
        return "Точка с координатами - x = $x1, y = $y1"
    }

    fun draw(x1: Int, y1: Int, radius: Int): String {
        return "Круг с координатами - x = $x1, y = $y1; радиус = $radius"
    }

    fun draw(x1: Float, y1: Float, radius: Float): String {
        return "Круг с координатами - x = $x1, y = $y1; радиус = $radius"
    }

    fun draw(x1: Int, y1: Int, x2: Int, y2: Int): String {
        return "Прямогуольник с координатами - x1 = $x1, y1 = $y1; x2 = $x2, y2 = $y2"
    }

    fun draw(x1: Float, y1: Float, x2: Float, y2: Float): String {
        return "Прямогуольник с координатами - x1 = $x1, y1 = $y1; x2 = $x2, y2 = $y2"
    }
}

fun main() {
    val screen1 = Screen()

    println("Нарисована фигура: ${screen1.draw(3, 4)}")
    println("Нарисована фигура: ${screen1.draw(3.5F, 4.5F)}")
    println("Нарисована фигура: ${screen1.draw(10, 2, 20)}")
    println("Нарисована фигура: ${screen1.draw(31.4F, 21.0F, 45.2F)}")
    println("Нарисована фигура: ${screen1.draw(48, -92, 103, 0)}")
    println("Нарисована фигура: ${screen1.draw(123.1F, 351.4F, 94.6F, 42.8F)}")
}