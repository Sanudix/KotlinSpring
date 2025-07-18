package org.example.lesson_13

class Contacts(
    val name: String,
    val number: Long,
    var company: String? = null,
){
    fun printContact(){
        println("Номер контакта $name из компании \"${company?: "<не указано>"}\": $number.")
    }
}

fun main() {
    val book1 = Contacts("Альберт", 9881600124)
    val book2 = Contacts("Горик", 9110974172, "Мегафон")

    book1.printContact()
    book2.printContact()
}