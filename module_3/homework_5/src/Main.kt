/** 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 3. Kotlin введение. Синтаксис языка.
 * Домашнее задание:
 * 1. Пользователь вводит с клавиатуры число. Требуется посчитать факториал
 * числа. Например, если введено 3, факториал числа 1*2*3 = 6.
 * 2. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1, 2, …, 10
 * кг конфет.
 * 3. Даны два целых числа A и B (A<B). Вывести в порядке возрастания все целые
 * числа, расположенные между A и B (включая сами числа A и B), а также количество Nэтих чисел.
 * 4. Дано целое число N (>0). Используя операции деления нацело и взятия
 * остатка от деления, вывести все его цифры, начиная с самой правой.
 * 5. Напишите программу, в которой выводятся на экран числа от 1 до 20
 * включительно со следующими условиями: если числа нечетные – их не выводить
 * на экран, если делятся на 4 без остатка – умножаем на 2, если число равно 19 завершаем программу.
 * 6. За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите
 * программу, в которой вычисляется конечная сумму вклада с учетом начисления
 * процентов за каждый месяц. Сумма вклада равна 350, количество месяцев – 9.
 **/

fun main() {

    // 1 задание
    println("1 задание :")
    print("Введите число : ")
    val input: Int = readln().toInt()
    var iterator: Int = 0
    var factorial: Int = 1
    while (input > 0 && iterator < input) factorial *= ++iterator
    println("Факториал числа $input = $factorial")

    // 2 задание
    println("2 задание :")
    val pricePerKg: Double = 55.53
    var countKg: Int = 0
    while (countKg++ < 10) println(
        "Стоимость конфет за $countKg кг. = " +
                "${Math.round(countKg * pricePerKg)}"
    )

    // 3 задание
    println("3 задание :")
    val a: Int = 1
    val b: Int = 10
    var c: Int = a
    while (c <= b) print("${c++} ")
    c = b - a
    print("\nКол-во чисел между a и b = $c")

    // 4 задание
    println("4 задание :")
    var N: Int = 123456
    while (N > 0) {
        val digit = N % 10
        print("$digit ")
        N /= 10
    }

    // 5 задание
    println("5 задание :")
    var number: Int = 0
    while (number < 19) {
        number++
        if (number % 4 == 0) print("${number * 2} ")
    }

    // 6 задание
    println("6 задание :")

    val rate: Double = 7.0
    val months: Int = 9
    var deposit: Double = 350.0
    var currentMonth: Int = 0

    while (currentMonth < months) {
        currentMonth++
        deposit = deposit + (deposit * rate / 100)
    }
    println("Сумма вклада за 9 месяцев = ${Math.round(deposit)}")
}