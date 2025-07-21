open class Message(
    val id: Int,
    val text: String,
    val author: String
)

class ChildMessage(
    id: Int,
    text: String,
    author: String,
    val parentMessageId: Int
) : Message(id, text, author) {
}

class Chat {
    private val messages = mutableListOf<Message>()
    private var nextId = 1

    fun addMessage(text: String, author: String): Int {
        val id = nextId++
        messages.add(Message(id, text, author))
        return id
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int): Int {
        val id = nextId++
        messages.add(ChildMessage(id, text, author, parentMessageId))
        return id
    }

    fun printChat() {
        val threadMessages = messages
            .filterIsInstance<ChildMessage>()
            .groupBy { it.parentMessageId }

        messages.forEach { message ->
            when (message) {
                is ChildMessage -> {}
                else -> {
                    println("${message.author}: ${message.text}")
                    threadMessages[message.id]?.forEach { child ->
                        println("\t${child.author}: ${child.text}")
                    }
                }
            }
        }
    }
}


fun main() {
    val chat = Chat()

    val msg1 = chat.addMessage("Доброе утро!", "Павел")
    val msg2 = chat.addMessage("Добрый вечер!", "Борис")

    chat.addThreadMessage("Добрый, скоро солнце сядет.", "Виктор", msg2)
    chat.addThreadMessage("Взаимно!", "Дмитрий", msg1)
    chat.addThreadMessage("Уже село!", "Галина", msg2)

    chat.printChat()
}