package org.example.lesson_22

fun main() {
    val instanceMainScreen = MainScreenViewModel()
    instanceMainScreen.loadData()
}

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false
)

class MainScreenViewModel() {

    private var _mainScreenState = MainScreenState()

    fun loadData() {
        _mainScreenState = MainScreenState(
            data = null,
            isLoading = false
        )
        println("Отсуствие данных: data = ${_mainScreenState.data}, isLoading = ${_mainScreenState.isLoading}")

        _mainScreenState = _mainScreenState.copy(
            isLoading = true
        )
        println("Загрузка данных: data = ${_mainScreenState.data}, isLoading = ${_mainScreenState.isLoading}")

        _mainScreenState = _mainScreenState.copy(
            data = "Важные данные!",
            isLoading = false
        )
        println("Наличие загруженных данных: data = ${_mainScreenState.data}, isLoading = ${_mainScreenState.isLoading}")
    }
}