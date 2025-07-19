package org.example.lesson_13

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContact() {
        println("Контакт: $name, Телефон: $phoneNumber, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val phoneBook = mutableListOf<Contact>()

    while (true) {
        println("\nДобавление нового контакта")
        print("Введите имя (или 'exit' для завершения): ")
        val name = readLine()?.trim().takeIf { !it.isNullOrEmpty() } ?: continue

        if (name.equals("exit", ignoreCase = true)) break

        print("Введите номер телефона: ")
        val phoneInput = readLine()?.trim()
        val phoneNumber = phoneInput?.toLongOrNull()
        if (phoneNumber == null) {
            println("Ошибка: номер телефона должен быть числом. Контакт не добавлен.")
            continue
        }

        print("Введите компанию (оставьте пустым, если нет): ")
        val company = readLine()?.trim().takeIf { !it.isNullOrEmpty() }

        val newContact = Contact(name, phoneNumber, company)
        phoneBook.add(newContact)
        println("Контакт успешно добавлен!")
    }

    println("\nТелефонная книга:")
    phoneBook.forEach { it.printContact() }
}