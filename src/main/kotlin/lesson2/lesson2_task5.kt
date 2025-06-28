package org.example.lesson2

import kotlin.math.pow

const val HUNDRED = 100

fun main() {
    val startSum = 70_000
    val countOfYears = 20
    val percentageOfContribution = 16.7

    val resultSum: Double = startSum * (1 + percentageOfContribution / HUNDRED).pow(countOfYears.toDouble())
    println("%.3f".format(resultSum))
}