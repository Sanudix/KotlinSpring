package org.example.lesson_16

class PlayingCube() {
    private val value: Int = (1..6).random()
    fun getValue() {
        println("Значение игрального кубика: $value")
    }
}

fun main() {
    val cube = PlayingCube()
    cube.getValue()
}