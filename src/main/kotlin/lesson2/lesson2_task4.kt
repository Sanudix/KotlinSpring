package org.example.lesson2

fun main(){
    val crystalOre: Byte = 7
    val ironOre: Byte = 11
    val valueOfBuff: Float = 0.2f
    val additionalCrystallOre: Byte
    val additionalIronOre: Byte

    additionalCrystallOre = (crystalOre * valueOfBuff).toInt().toByte()
    additionalIronOre = (ironOre * valueOfBuff).toInt().toByte()
    println("Бонусная кристаллическая руда: ${additionalCrystallOre}")
    println("Бонусная железная руда: ${additionalIronOre}")
}