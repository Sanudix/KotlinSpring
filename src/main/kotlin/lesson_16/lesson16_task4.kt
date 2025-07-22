package org.example.lesson_16

import kotlin.random.Random
import kotlin.random.nextInt

const val WAITING_TIME = 15

class OnlineOrdering(
    private val orderNumber: Int,
    private var readyStatus: Boolean,
) {
    fun changeStatus(newStatus: Boolean) {
        readyStatus = newStatus
    }
}

fun sendRequest(newStatus: Boolean, order: OnlineOrdering) {
    println(
        """Вы отправили заявку на изменение статуса, менеджеру.
        |Ответ на заявку придет в течении 15 секунд.
    """.trimMargin()
    )

    val randomTime = Random.nextInt(1, 11)

    for (i in WAITING_TIME downTo 1) {
        if (i == randomTime) {
            break
        } else {
            println("Осталось секунд: $i")
            Thread.sleep(1000)
        }
    }
    println("Заявка одобрена, статус готовности заказа: $newStatus!")
    order.changeStatus(newStatus)
}

fun main() {
    val order1 = OnlineOrdering(176, false)

    sendRequest(true, order1)
}