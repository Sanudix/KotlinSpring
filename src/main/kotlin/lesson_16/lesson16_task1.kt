package org.example.lesson_16

import kotlin.random.Random

class PlayingCube() {
    private val value: Int = Random.nextInt(1, 6)
    fun getValue() {
        println("Значение игрального кубика: $value")
    }
}

fun main() {
    val cube = PlayingCube()
    cube.getValue()
}