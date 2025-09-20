package org.example.lesson_22

fun main() {
    val book1 = RegularBook("Идиот", "Достоевский")
    val book2 = RegularBook("Идиот", "Достоевский")
    val book3 = DataBook("Идиот", "Достоевский")
    val book4 = DataBook("Идиот", "Достоевский")

    println(book1)
    println(book2)
    println("Сравнение RegularBook и RegularBook: ${book1 == book2}") //false, потому что сравниваются хэш-коды объектов в памяти
    println("Сравнение RegularBook и DataBook: ${book1 == book3}") //false, потому что хэш-код сравнимается со значениями полей
    println("Сравнение DataBook и DataBook: ${book4 == book3}") //true, потому что сравниваются значения экземпляров
}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)
