package org.example.lesson_18

class Order(val orderNumber: Int) {
    var products: Any = ""

    fun printOrderData(_products: List<String>) {
        when {
            _products.isEmpty() -> println("Нет заказанных товаров")
            _products.size == 1 -> println("Заказан следующий товар: [${_products[0]}]")
            else -> {
                val productsString = _products.joinToString("], [")
                println("Заказаны следующие товары: [$productsString]")
            }
        }
        products = _products
    }

    fun printOrderData(_products: String) {
        println("Заказан товар: [$_products]")
        products = _products
    }
}

fun main() {
    val productsList = listOf("Volkswagen Touareg", "Porsche Cayenne", "Audi Q8")
    val product = "Volkswagen Passat"

    val order1 = Order(199023)
    val order2 = Order(333922)

    order1.printOrderData(productsList)
    order2.printOrderData(product)
}