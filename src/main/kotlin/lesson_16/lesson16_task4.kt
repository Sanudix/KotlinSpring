package org.example.lesson_16

const val WAITING_TIME = 15

class OnlineOrdering(
    private val orderNumber: Int,
    private var readyStatus: Boolean,
) {
    fun changeStatus(newStatus: Boolean) {
        readyStatus = newStatus
    }

    fun updateStatus(newStatus: Boolean) {
        changeStatus(newStatus)
    }
}

fun sendRequest(newStatus: Boolean, order: OnlineOrdering) {
    println(
        """Вы отправили заявку на изменение статуса, менеджеру.
        |Ответ на заявку придет в течении 15 секунд.
    """.trimMargin()
    )

    val randomTime = (1..10).random()

    for (i in WAITING_TIME downTo 1) {
        if (i == randomTime) {
            break
        } else {
            println("Осталось секунд: $i")
            Thread.sleep(1000)
        }
    }
    println("Заявка одобрена, статус готовности заказа: $newStatus!")
    order.updateStatus(newStatus)
}

fun main() {
    val order1 = OnlineOrdering(176, false)

    sendRequest(true, order1)
}