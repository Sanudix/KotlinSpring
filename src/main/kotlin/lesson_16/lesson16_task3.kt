package org.example.lesson_16

const val EXISTING_PASSWORD = "RuSSia"

class User(
    private val login: String,
    private val password: String,
) {
    fun validation(inputPassword: String): Boolean {
        if (inputPassword == EXISTING_PASSWORD) return true
        else return false
    }

    fun getPassword() = password
}

fun main() {
    val user1 = User("Admin", "RuSSia")
    val validationResult = user1.validation(user1.getPassword())

    if (validationResult) println("Пароль корректный.")
    else println("Неверный пароль.")
}