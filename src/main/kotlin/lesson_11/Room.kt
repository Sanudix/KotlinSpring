package org.example.lesson_11

class Room (
    val cover: String,
    val title: String,
    var usersName: MutableList<String>,
    var usersStatus: MutableList<String>,
)
{
    fun addUser(userInfo: User){
        usersName += userInfo.name
        usersStatus +=userInfo.status
    }

    fun updateStatus(name: String, newStatus: String) {
        val index = usersName.indexOf(name)
        usersStatus[index] = newStatus
    }
}

class User(
    val name: String,
    val status: String,
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
        usersName = mutableListOf(),
        usersStatus = mutableListOf(),
    )

     carRoom.addUser(user1)
     carRoom.addUser(user2)
     carRoom.addUser(user3)

    carRoom.updateStatus("Давид", "разговаривает")
}