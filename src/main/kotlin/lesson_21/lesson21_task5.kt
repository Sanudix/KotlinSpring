package org.example.lesson_21

fun main() {
    val playerMap = mapOf<String, Int>(
        "Скрытность" to 2000,
        "Выносливость" to 2300,
        "Интеллект" to 4000,
        "Ловкость" to 3250,
        "Харизма" to 4000
    )

    println(playerMap.maxCategory())
}

fun Map<String, Int>.maxCategory(): String? {
    return this.maxByOrNull { it.value }?.key
}