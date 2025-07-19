package org.example.lesson_13

class ContactBook(
    val name: String?,
    val phoneNumber: Long?,
    val company: String? = null,
) {
    fun printContact() {
        println("Контакт: $name, Телефон: $phoneNumber, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val phoneBook = mutableListOf<ContactBook>()
    print("Сколько контактов вы хотите добавить (напишите число): ")
    val numberOfContacts = readln().toInt()

    for (i in 0 until numberOfContacts) {
        print("Введите имя контакта: ")
        val name = readLine()?.trim()

        print("Введите номер контакта: ")
        val numberInput = readLine()
        val number = try {
            numberInput?.trim()?.toLong()
        } catch (e: NumberFormatException) {
            println("Ошибка \"NumberFormatException\": номер должен состоять только из цифр. Контакт не добавлен.\n")
            continue
        }

        print("Введите компанию контакта: ")
        val company = readLine()?.trim()
        println()

        phoneBook.add(ContactBook(name = name, phoneNumber = number, company = company))
    }

    println("\nТелефонная книга:")
    phoneBook.forEach { it.printContact() }
    if (phoneBook.size < numberOfContacts) {
        println("${numberOfContacts - phoneBook.size} контакт(а/ов) не добавлено из-за ошибочного ввода.")
    }
}