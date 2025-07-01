package org.example.lesson4

const val CHECK_STATUS_DAMAGE = false
const val LOW_NUMBER_CREWS = 55
const val HIGH_NUMBER_CREWS = 70
const val CHECK_NUMBER_BOX = 50
const val CHECK_GOOD_WEATHER_CONDITIONS = true

fun main(){
    print("Наличие повреждений корпуса (Boolean переменная): ")
    val statusOfDamage: Boolean = readln().toBoolean()
    print("Количество людей в экипаже (целое неотрициательное число): ")
    val numberOfCrews: Int = readln().toInt()
    print("Количество ящиков с провизией на борту (целое неотрициательное число): ")
    val numberOfBox: Int = readln().toInt()
    print("Благоприятность метеоусловий (Boolean переменная): ")
    val goodWeatherConditions: Boolean = readln().toBoolean()

    println("Корабль может отправиться в плаванье: " +
            "${((statusOfDamage == CHECK_STATUS_DAMAGE) && ((numberOfCrews >= LOW_NUMBER_CREWS)
                    && (numberOfCrews <= HIGH_NUMBER_CREWS)) && (numberOfBox > CHECK_NUMBER_BOX)) 
                    || ((statusOfDamage != CHECK_STATUS_DAMAGE) && (numberOfCrews == HIGH_NUMBER_CREWS)
                    && (goodWeatherConditions == CHECK_GOOD_WEATHER_CONDITIONS) && (numberOfBox >= CHECK_NUMBER_BOX))}")
}