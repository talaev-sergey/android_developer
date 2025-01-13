/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 * 1. Написать абстрактный класс «Службы экстренного реагирования». У него есть
 * свой конструктор, содержащий свойства name и phone. Он содержит функцию, характеризующий его деятельность.
 * Напишите интерфейс, который содержит функцию getDescription, дающую описание той или ной службы или организации.
 * 2. Даны целые положительные числа A и B. Найти их наибольший общий делитель
 * (НОД), используя алгоритм Евклида: НОД(A,B) = НОД(B, A mod B), если B≠0; НОД(A, 0) = A.
 * 3. Дан набор целых чисел. Найти второе максимальное число.
 **/

fun main() {
    // 1 задание
    println("1 задание:")
    val fireService = FireService("Пожарная служба", "01")
    fireService.getDiscription()

    // 2 задание
    var a = 4
    var b = 10
    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }
    println("2 задание: $a")

    // 3 задание
    val array = arrayOf(1, 20, 3, 14, 5)
    var firstMax = 0
    var secondMax = 0

    for (i in array) {
        when {
            i > firstMax -> {
                secondMax = firstMax
                firstMax = i
            }

            i != firstMax && i > secondMax -> {
                secondMax = i
            }
        }
    }
    println("3 задание: ${secondMax}")
}