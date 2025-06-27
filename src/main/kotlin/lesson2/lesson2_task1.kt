package org.example.lesson2

fun main(){
    val firstStudentScore: Int = 3
    val secondStudentScore: Int = 4
    val thirdStudentScore: Int = 3
    val fourthStudentScore: Int = 5
    val countOfStudents: Float = 4.0F

    val arithmeticMean = (firstStudentScore + secondStudentScore + thirdStudentScore + fourthStudentScore) / countOfStudents
    println("%.2f".format(arithmeticMean))
}