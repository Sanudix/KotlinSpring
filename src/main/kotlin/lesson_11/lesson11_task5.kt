package org.example.lesson_11

import java.util.UUID

class Member private constructor(
    val userId: String,
    val userName: String
) {
    class Builder {
        private var userId: String = UUID.randomUUID().toString()
        private lateinit var userName: String

        fun setUserName(userName: String) = apply { this.userName = userName }
        fun build() = Member(userId, userName)
    }
}

class ForumMessage private constructor(
    val messageId: String,
    val authorId: String,
    val message: String
) {
    class Builder {
        private var messageId: String = UUID.randomUUID().toString()
        private lateinit var authorId: String
        private lateinit var message: String

        fun setAuthorId(authorId: String) = apply { this.authorId = authorId }
        fun setMessage(message: String) = apply { this.message = message }
        fun build() = ForumMessage(messageId, authorId, message)
    }
}

class Forum {
    private val members = mutableListOf<Member>()
    private val messages = mutableListOf<ForumMessage>()

    fun createNewUser(userName: String): Member {
        val newMember = Member.Builder()
            .setUserName(userName)
            .build()
        members.add(newMember)
        return newMember
    }

    fun createNewMessage(authorId: String, message: String): ForumMessage? {
        if (members.any { it.userId == authorId }) {
            val newMessage = ForumMessage.Builder()
                .setAuthorId(authorId)
                .setMessage(message)
                .build()
            messages.add(newMessage)
            return newMessage
        }
        println("Ошибка: Пользователь с ID $authorId не найден")
        return null
    }

    fun printThread() {
        messages.forEach { msg ->
            val author = members.find { it.userId == msg.authorId }?.userName ?: "Неизвестный"
            println("$author: ${msg.message}")
        }
    }
}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Александр")
    val user2 = forum.createNewUser("Юлий")

    forum.createNewMessage(user1.userId, "Привет, потомки!")
    forum.createNewMessage(user2.userId, "Ave, Александр!")
    forum.createNewMessage(user1.userId, "Как ваши дела?")
    forum.createNewMessage(user2.userId, "На Индию походами не хожу. Спасибо за опыт!")
    forum.createNewMessage("несуществующий_id", "Это не должно работать")

    println("\nИстория сообщений:")
    forum.printThread()
}