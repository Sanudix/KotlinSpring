package org.example.lesson5

fun main(){
    val userLogin = "Zaphod"
    val userPassword = "PanGalactic"
    val newLogin: String
    val newPassword: String

    println("Если желаете войти в систему - введите 1.\n" +
            "Если желаете зарегистрироваться - введите 2.")
    print("Введите значение: ")
    val scenarioSelection = readln()

    if (scenarioSelection == "1") {
        print("Введите имя пользователя: ")
        val inputLogin = readln()
        print("Введите пароль пользователя: ")
        val inputPassword = readln()

        if(inputLogin == userLogin) {
            if(inputPassword == userPassword){
                println("Пользователь \"$userLogin\", вам разрешено входить на борт корабля \"Heart of Gold\".")
            } else {
                println("Неверный пароль для пользователя \"$userLogin\".")
            }
        } else {
            println("Пользователя с таким именем не существует.")
        }
    } else if (scenarioSelection == "2") {
        print("Введите имя нового пользователя: ")
        newLogin = readln()
        print("Введите пароль: ")
        newPassword = readln()
        println("Создан новый пользователь! Имя: \"$newLogin\", Пароль: $newPassword.")
    } else {
        println("Было введено некорретное значение.")
    }

}