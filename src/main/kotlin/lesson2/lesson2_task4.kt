package org.example.lesson2

const val HUNDRED = 100

fun main(){
    val crystalOre = 7
    val ironOre = 11
    val valueOfBuff = 20
    val additionalCrystallOre = (crystalOre * valueOfBuff / HUNDRED)
    val additionalIronOre = (ironOre * valueOfBuff / HUNDRED)

    println("Бонусная кристаллическая руда: ${additionalCrystallOre}")
    println("Бонусная железная руда: ${additionalIronOre}")
}