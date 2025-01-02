/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 * 1. Написать функцию, на вход которой поступает массив из произвольного
 * количества элементов. Данная функция проверяет, если в массиве локальные
 * минимумы и возвращает число локальных минимумов. (локальный минимум –
 * это когда два соседних элемента больше того, что между ними, например, 5,2,7).
 * 2. Напишите функцию, в которой проверяется созданный Вами массив целых чисел.
 * Если в нем имеются отрицательные элементы, то необходимо увеличить этот элемент на единицу и вернуть массив.
 * 3. Дана матрица размера M×N и целое число K (1≤K≤M). Вывести элементы K-й строки данной матрицы.
 **/
fun main() {
    println("1 задание : ${countLocalMinimus(5, 2, 3, 4, 5)}")
    val arrayInt = intArrayOf(1, -2, 3, -4, 5)
    println("2 задание : ${newArray(arrayInt).joinToString(" ")}")
    val matrixInt = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9),
    )
    println("3 задание : ${getRowMatrix(matrixInt, 1).joinToString(" ")}")
}

// 1 задание
fun countLocalMinimus(vararg arg: Int): Int {
    var countMin = 0
    if (arg.size < 3) return countMin
    else {
        for (i in 1 until arg.size - 1) {
            if (arg[i] < arg[i - 1] && arg[i] < arg[i + 1]) countMin++
        }
    }
    return countMin
}

// 2 задание
fun newArray(arg: IntArray): IntArray {
    var localArray = arg.copyOf()
    for (i in localArray.indices) {
        if (localArray[i] < 0) localArray[i]++
    }
    return localArray
}

// 3 задание
fun getRowMatrix(matrix: Array<Array<Int>>, row: Int): Array<Int> {
    if (row < 1 || row > matrix.size) {
        return matrix[0]
    }
    return matrix[row - 1]
}