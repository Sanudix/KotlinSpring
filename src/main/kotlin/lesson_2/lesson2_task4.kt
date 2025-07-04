package org.example.lesson2

const val HUNDREDS = 100

fun main(){
    val crystalOre = 7
    val ironOre = 11
    val valueOfBuff = 20
    val additionalCrystallOre = (crystalOre * valueOfBuff / HUNDREDS)
    val additionalIronOre = (ironOre * valueOfBuff / HUNDREDS)

    println("Бонусная кристаллическая руда: ${additionalCrystallOre}")
    println("Бонусная железная руда: ${additionalIronOre}")
}