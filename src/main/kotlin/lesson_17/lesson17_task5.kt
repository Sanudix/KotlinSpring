package org.example.lesson_17

class User(
    private val realPassword: String,
    private var realLogin: String,
) {
    var password: String
        get() = "*".repeat(realPassword.length)
        set(value) {
            println("Вы не можете изменить пароль.")
        }

    var login: String
        get() {
            println("Текущую логин: \"$realLogin\".")
            return realLogin
        }
        set(value) {
            println("Логин изменен с \"${realLogin}\" на \"$value\".")
            realLogin = value
        }
}

fun printPassword(count: Int): String {
    var temp: String = ""
    for (i in 0 until count) {
        temp += "*"
    }
    return temp
}

fun main() {
    val user1 = User("123333", "Olya")

    user1.password
    user1.password = "gAf12"

    user1.login
    user1.login = "Nastia"
}