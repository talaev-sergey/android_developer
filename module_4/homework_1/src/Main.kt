import kotlin.math.abs
import kotlin.math.pow

/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 * 1. Написать функцию возведения числа a в степень n.
 * 2. Написать функцию, которая принимает два целых числа a и b (a<b).
 * Она вычисляет произведение всех целых чисел от a до b включительно.
 * 3. Написать функцию, которая принимает два целых числа a и b.
 * Результатом работы функции должен быть вычисленный наибольший общий делитель a и b.
 **/

fun main() {
    powNumber(2, 2)
    productInRange(1,5)
    gcd(2,7)
}

// 1 задание
fun powNumber(a: Int, n: Int) {
    println("1 задание : ${a.toDouble().pow(n)}")
}

// 2 задание
fun productInRange(a: Int, b: Int) {
    var result = a
    for (i in a..b) result *= i
    println("2 задание : $result")
}

//3 задание
fun gcd(a : Int, b : Int){
    var numA = abs(a)
    var numB = abs(b)
    while (numB != 0){
        val temp = numB
        numB = numA % numB
        numA = temp
    }
    println("3 задание : $numA")
}