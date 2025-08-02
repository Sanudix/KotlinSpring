package org.example.lesson_19

enum class Categories {
    CLOTHES {
        override fun getCategoryName(): String {
            return "одежда (${CLOTHES.name})"
        }
    },
    STATIONERY {
        override fun getCategoryName(): String {
            return "канцтовары (${CLOTHES.name})"
        }
    },
    DIFFERENT {
        override fun getCategoryName(): String {
            return "разное (${CLOTHES.name})"
        }
    };

    abstract fun getCategoryName(): String
}

class Product(
    val name: String,
    val id: Int,
    val category: Categories
) {
    fun printInfo() {
        println("Информация о товаре \"$name\": id - $id, category - ${category.getCategoryName()}.")
    }
}

fun main() {
    val product1 = Product("Синие джинсы", 8362, Categories.CLOTHES)

    product1.printInfo()
}