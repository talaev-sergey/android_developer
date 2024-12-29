/** 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 3. Kotlin введение. Синтаксис языка.
 * Домашнее задание:
 * 1. Найти минимальный элемент в целочисленном массиве размера 3 х 3.
 * 2. Создать матрицу размером 3 х 5. Найти элемент в этом массиве, который является средним(медиана).
 * 3. Дана матрица размером 5 х 5. Заполнить ее единицами в таком порядке:
 * 0 0 0 0 0
 * 0 0 0 0 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 * 4. Дан набор целых чисел. Найти второе максимальное число.
 **/

fun main() {
    // 1 задание
    val matrixInt = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 0, 9)
    )
    val minValue = matrixInt.flatten().minOrNull()

    // 2 задание
    val matrixTwo = arrayOf(
        arrayOf(1, 2, 3, 4, 5),
        arrayOf(6, 7, 8, 9, 10),
        arrayOf(11, 12, 13, 14, 15)
    )
    val flatArray = matrixTwo.flatten().sorted()
    val median = flatArray[flatArray.size / 2]

    // 3 задание
    val matrixThree = Array(5) { i ->
        Array(5) { j ->
            when {
                i == 4 -> 1
                i == 3 && j in 1..3 -> 1
                i == 2 && j == 2 -> 1
                else -> 0
            }
        }
    }

    // 4 задание
    val arrayInt = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val secondMaxValue = arrayInt.distinct().sortedDescending()[1]

    println("1 задание : $minValue")
    println("2 задание : $median")
    println("3 задание :")
    matrixThree.forEach { row -> println(row.joinToString(" ")) }
    println("4 задание : $secondMaxValue")
}