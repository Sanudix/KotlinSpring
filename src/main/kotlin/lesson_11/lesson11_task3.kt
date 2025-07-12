package org.example.lesson_11
import java.util.UUID

class Room(
    val cover: String,
    val title: String,
    var usersList: MutableList<User>,
) {
    fun addUser(userInfo: User): User {
        if (usersList.any { it.name == userInfo.name }) {
            throw IllegalArgumentException("Пользователь с именем '$userInfo.name' уже существует")
        }

        userInfo.id = UUID.randomUUID().toString()
        usersList.add(userInfo)
        return userInfo
    }

    fun updateStatus(name: String, newStatus: String) {
        val user = usersList.find { it.name == name }
        if (user != null) {
            user.status = newStatus
            println("У пользователя $name новый статус: $newStatus")
        } else {
            println("Пользователь $name не найден в комнате!")
        }
    }
}

class User(
    val name: String,
    var status: String,
    var id: String = ""
) {}

fun main() {
    val user1: User = User(
        name = "Aлан",
        status = "разговаривает",
    )

    val user2: User = User(
        name = "Давид",
        status = "микрофон выключен",
    )

    val user3: User = User(
        name = "Евгений",
        status = "пользователь заглушен",
    )

    val carRoom: Room = Room(
        cover = "pictureOfCar",
        title = "Car Club",
        usersList = mutableListOf(),
    )

    carRoom.addUser(user1)
    carRoom.addUser(user2)
    carRoom.addUser(user3)

    carRoom.updateStatus("Давид", "разговаривает")
    carRoom.updateStatus("Рома", "разговаривает")
}