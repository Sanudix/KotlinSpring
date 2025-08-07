package org.example.lesson_20

fun main() {
    val lambdaFunction: (String) -> Unit = { userName: String ->
        println("С наступающим Новым Годом, $userName!")
    }

    lambdaFunction("Nikita")
}