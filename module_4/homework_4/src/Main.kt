/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 * 1. Создать класс Registration с полями email и password. Для этого свойства
 * email написать геттер, который возвращает значение этого поля в верхнем регистре.
 * Для поля password написать сеттер, который контролирует, чтобы длина пароля была
 * не менее 6 символов, иначе выводит сообщение, что не соответствует его длина.
 * 2. Написать функцию поиска четных чисел двумерного массива размерностью 4х4.
 * 3. Написать функцию заполнения двумерного массива 4 х 4 числами от 1 до 16
 * включительно.
 * 4. Написать функцию вывода в консоль положительных элементов массива.
 * Проверка на положительность числа выполняется локальной функцией внутри вышеуказанной.
 **/

fun main() {
    val r = Registration()
    r.setEmail("admin")
    r.setPassword("qwerty")
    println("1 задание : ${r.getEmail()} ${r.getPassword()}")

    print("2 задание : ")
    val array = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(5, 6, 7, 8),
        arrayOf(9, 10, 11, 12),
        arrayOf(13, 14, 15, 16)
    )
    findEvenNumbers(array)

    println()
    print("3 задание: ")
    var intMatrix = Array(4) { Array(4) { 0 } }
    fillMatrix(intMatrix)

    println()
    print("4 задание: ")
    val arrayTwo = arrayOf(0, -1, 2, -3, 4, -5)
    getPositiveNumbers(arrayTwo)
}

// 2 задание
fun findEvenNumbers(matrix: Array<Array<Int>>) {
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            if (matrix[i][j] % 2 == 0) print("${matrix[i][j]} ")
        }
    }
}

// 3 задание
fun fillMatrix(matrix: Array<Array<Int>>) {
    var iterator = 1
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            matrix[i][j] = iterator++
            print("${matrix[i][j]} ")
        }
    }
}

// 4 задание
fun getPositiveNumbers(array: Array<Int>) {
    fun isPositiveNumber() {
        for (i in array.indices) if (array[i] > 0) print("${array[i]} ")
    }
    return isPositiveNumber()
}