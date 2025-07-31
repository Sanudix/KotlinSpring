package org.example.lesson_13

class TelephoneBook(
    val name: String,
    val number: Long,
    var company: String? = null,
) {
    fun printContact() {
        println("Номер контакта $name из компании \"${company ?: "<не указано>"}\": $number.")
    }
}

fun main() {
    val book1 = TelephoneBook("Альберт", 9881600124)
    val book2 = TelephoneBook("Горик", 9110974172, "Мегафон")
    val book3 = TelephoneBook("Армен", 9193471882)
    val book4 = TelephoneBook("Артур", 9110926719,"null")
    val book5 = TelephoneBook("Роман", 9910978372, "МТС")

    val contactsList = mutableListOf(book1, book2, book3, book4, book5)

    var newContactList = contactsList.mapNotNull { it.company }
    println(newContactList)
}