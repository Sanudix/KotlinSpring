package org.example.lesson4

const val NUMBER_OF_ALL_TABLES = 13

fun main(){
    val todayReservedTables = 13
    val tomorrowReservedTables = 9

    println("Доступность столиков на сегодня: ${NUMBER_OF_ALL_TABLES > todayReservedTables}\n" +
            "Доступность столиков на завтра: ${NUMBER_OF_ALL_TABLES > tomorrowReservedTables}")
}
