package org.example.lesson_13

class PhoneBook(
    val name: String,
    val number: Long,
    var company: String?,
) {
}

fun main() {
    val book1 = PhoneBook("Альберт", 9881600124, null)
    val book2 = PhoneBook("Горик", 9110974172, "Мегафон")
}