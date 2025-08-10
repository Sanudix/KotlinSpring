package org.example.lesson_20

fun main() {
    val list = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")

    val newList = list.filterIndexed { index, _ -> index % 2 == 0 }.map { { println("Нажат элемент $it") } }

    println(list)
    newList.forEach {
        it()
    }
}
