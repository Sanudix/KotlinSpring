package org.example.lesson_15

interface Search {
    fun searchComponent(element: Component, instrument: Instrument) {
        println("Выполняется поиск ${element.name} ${element.model} для ${instrument.name} ${instrument.model}.")
    }

    fun searchInstrument(instrument: Instrument) {
        println("Выполняется поиск ${instrument.name} ${instrument.model} в каталоге магазина.")
    }
}

abstract class MusicalSubject(
    val name: String,
    val model: String,
    val count: Int,
) : Search

class Instrument(
    name: String,
    model: String,
    count: Int,
    val producingCountry: String,
    val releaseYear: Int,
) : MusicalSubject(name, model, count)

class Component(
    name: String,
    model: String,
    count: Int,
    val instrumentName: String,
) : MusicalSubject(name, model, count)

fun main() {
    val instrument = Instrument("Гитара", "Yamaha F310", 27, "Япония", 2019)
    val component = Component("Ремень", "SP141 BLU",110, "Гитара")

    component.searchComponent( component, instrument)
    component.searchInstrument( instrument)
}