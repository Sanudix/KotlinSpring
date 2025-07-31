package org.example.lesson_17

class User(
    _password: String,
    _login: String,
) {
    var password: String = _password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль.")
        }

    var login: String = _login
        get() = field
        set(value) {
            println("Логин изменен с \"${field}\" на \"$value\".")
            field = value
        }
}

fun main() {
    val user1 = User("123333", "Olya")

    println("Текущий пароль: \"${user1.password}\".")
    user1.password = "gAf12"

    println("Текущий логин: \"${user1.login}\".")
    user1.login = "Nastia"
}