package org.example.lesson2

fun main(){
    val firstStudentScore = 3
    val secondStudentScore = 4
    val thirdStudentScore = 3
    val fourthStudentScore = 5
    val countOfStudents = 4

    val arithmeticMean = (((firstStudentScore + secondStudentScore + thirdStudentScore + fourthStudentScore)).toFloat() / countOfStudents)
    println("%.2f".format(arithmeticMean))
}