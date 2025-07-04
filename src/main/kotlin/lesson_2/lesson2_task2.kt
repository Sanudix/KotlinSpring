package org.example.lesson2

fun main(){
    val numberOfEmployee = 50
    val numberOfIntern = 30
    val salaryOfEmployee = 30000
    val salaryOfIntern = 20000

    val paymentToEmployee = numberOfEmployee * salaryOfEmployee
    val totalPayment = paymentToEmployee + numberOfIntern * salaryOfIntern
    val averageSalary = totalPayment / (numberOfEmployee + numberOfIntern)

    println("Расходы на выплату зарплаты постоянных сотрудников: " + paymentToEmployee)
    println("Общие расходы по ЗП после прихода стажеров: " + totalPayment)
    println("Среднюю ЗП одного сотрудника после устройства стажеров: " + averageSalary)
}