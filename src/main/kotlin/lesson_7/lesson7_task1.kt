package org.example.lesson_7

fun main(){
    val numbers = 0..9
    val arabicSymbols = 'a'..'z'
    var password: String = ""

    for (i in 1..3){
        password += arabicSymbols.random()
        password += numbers.random()
    }
    println("Пароль: $password")
}
