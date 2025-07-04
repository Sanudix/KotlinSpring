package org.example.lesson3

fun main(){
    var startPosition = "E2"
    var endPosition = "E4"
    var numberOfMoves = 1

    var stringMessage = "$startPosition-$endPosition; $numberOfMoves"
    println(stringMessage)

    startPosition = "D2"
    endPosition = "D4"
    numberOfMoves = 2
    stringMessage = "$startPosition-$endPosition; $numberOfMoves"
    println(stringMessage)
}