package org.example.lesson5

fun main(){
    println("Вы находитесь на этапе создания аккаунта.")
    print("Введите логин: ")
    var newLogin = readln()
    print("Введите пароль: ")
    var newPassword = readln()
    print("Повторно введите пароль: ")
    var tempPassword = readln()

    while (newPassword != tempPassword) {
        println("Пароли не совпадают, необходимо заново ввести данные.")
        print("Введите логин: ")
        newLogin = readln()
        print("Введите пароль: ")
        newPassword = readln()
        print("Повторно введите пароль: \n")
        tempPassword = readln()
    }
    println("Аккаунт создан!\n")

    var userLogin: String
    var userPassword: String

    do {
        println("Введите данные для входа в систему.")
        print("Введите логин: ")
        userLogin = readln()
        print("Введите пароль: ")
        userPassword = readln()
        println()
    } while(userLogin != newLogin || userPassword != newPassword)

    println("Вы вошли в систему!")
}