package org.example.lesson_15

abstract class ForumUser(
    val name: String,
) {
    fun readForum() {
        println("$name читает форум.")
    }
    fun writeMessage(message: String) {
        println("$name написал: $message.")
    }
}

class User(
    name: String,
) : ForumUser(name) {
}

class Admin(
    name: String,
) : ForumUser(name) {
    fun deleteMessage() {
        println("Администратор удалил сообщение.")
    }
    fun deleteUsers(user: User) {
        println("Администратор удалил пользователя ${user.name}.")
    }
}

fun main() {
    val admin = Admin("Secret")
    val user = User("Alex")

    user.readForum()
    user.writeMessage("Идите лесом!")

    admin.readForum()
    admin.writeMessage("Вы нарушили правила площадки.")
    admin.deleteMessage()
    admin.deleteUsers(user)
}