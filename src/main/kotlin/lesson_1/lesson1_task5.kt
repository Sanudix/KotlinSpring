package org.example.lesson_1

fun main(){
    val secondsAll: Short = 6480
    var hours: Short
    var minutes: Short
    val secondsRemaining: Byte = 0
    val SECONDS_IN_MINUTE: Short = 60

    minutes = (secondsAll / SECONDS_IN_MINUTE).toShort()
    hours = (minutes / SECONDS_IN_MINUTE).toShort()
    minutes = (minutes - SECONDS_IN_MINUTE).toShort()

    println("%02d:%02d:%02d".format(hours, minutes, secondsRemaining))
}