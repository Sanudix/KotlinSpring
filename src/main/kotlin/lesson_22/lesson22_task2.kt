package org.example.lesson_22

fun main() {
    val book1 = CommonBook("Война и Мир", "Толстой")
    val book2 = InfoBook("Война и Мир", "Толстой")

    println(book1) //выводится информация об объекте (хэш-код)
    println(book2) //вывелось значение свойств класса, так как в "data class" по умолчанию переопределен метод ".toString"
}

class CommonBook(
    val name: String,
    val author: String,
)

data class InfoBook(
    val name: String,
    val author: String,
)