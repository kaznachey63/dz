fun main() {
    println("Введите нат. число")
    val input = readln().toIntOrNull() ?: return
    println("Результат: ${input.toString(2)}")
}