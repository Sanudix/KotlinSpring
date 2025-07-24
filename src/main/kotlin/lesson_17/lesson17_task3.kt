class Folder(
    private val realName: String,
    private val realFilesCount: Int,
    private var isSecret: Boolean
) {
    val name: String
        get() = if (isSecret) "скрытая папка" else realName

    val filesCount: Int
        get() = if (isSecret) 0 else realFilesCount

    fun setSecretStatus(secret: Boolean) {
        isSecret = secret
    }
}

fun main() {
    val secretFolder = Folder("Документы абитуриентов", 1671, true)

    println("Демонстрация взаимодействия с секретной папкой.")
    println("Имя папки: ${secretFolder.name}")
    println("Количество файлов: ${secretFolder.filesCount}")

    secretFolder.setSecretStatus(false)

    println("\nДемонстрация взаимодействия после снятия секретности.")
    println("Имя папки: ${secretFolder.name}")
    println("Количество файлов: ${secretFolder.filesCount}")
}