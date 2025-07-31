package org.example.lesson_18

open class CubePackage(val height: Float) {
    open fun calculateArea(): Float = 6 * height * height

    open fun printParameters(): String {
        return String.format("Куб. Длина: %-8.2f", height)
    }
}

class ParallelepipedPackage(
    height: Float,
    val width: Float,
    val depth: Float,
) : CubePackage(height) {
    override fun calculateArea(): Float = 2 * (height * width + height * depth + width * depth)

    override fun printParameters(): String {
        return String.format("Параллелепипед. Высота: %-8.2f, ширина: %-8.2f, глубина: %-8.2f",
            height, width, depth)
    }
}

fun main() {
    val packagesList: List<CubePackage> = listOf(
        ParallelepipedPackage(2F, 3F, 4.4F),
        ParallelepipedPackage(10000F, 20.5F, 10F),
        CubePackage(3.8F),
        CubePackage(105F)
    )

    packagesList.forEach {
        println("${it.printParameters()} - площадь поверхности: ${"%.2f".format(it.calculateArea())}")
    }
}