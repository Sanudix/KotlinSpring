package org.example.lesson_15

interface Search {
    fun searchProcess(element: Component, instrument: Instrument) {
        println("Выполняется поиск ${element.name} для ${instrument.name}.")
    }
}

abstract class MusicalSubject(
    val name: String,
    val count: Int,
) : Search

class Instrument(
    name: String,
    count: Int,
    val producingCountry: String,
    val releaseYear: Int,
) : MusicalSubject(name, count)

class Component(
    name: String,
    count: Int,
    val instrumentName: String,
) : MusicalSubject(name, count)

fun main() {
    val instrument = Instrument("Гитара", 27, "Япония", 2019)
    val component = Component("Ремень", 110, "Гитара")

    component.searchProcess( component, instrument)
}