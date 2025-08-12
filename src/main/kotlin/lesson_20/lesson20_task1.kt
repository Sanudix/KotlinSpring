package org.example.lesson_20

fun main() {
    val lambdaFunction: (String) -> String = { userName: String ->
        "С наступающим Новым Годом, $userName!"
    }

    println(lambdaFunction("Nikita"))
}