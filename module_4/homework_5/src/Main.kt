/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 * 1. Создать класс Box(коробка), у которого есть свойства width, height, depth.
 * Написать функцию вычисления объёма коробки в классе Box. В классе с функцией
 * main создать экземпляр класса Box, в конструктор класса передать свойства, задать
 * им значения, вызвать функцию вычисления объема и вывести его на экран.
 * 2. Дан набор из N чисел. Найти минимальный и максимальный из элементов
 * данного набора и вывести их.
 * 3. Дан массив целых чисел 3, 67, 1, 55, 65, 89, 23. Вывести на экран
 * элементы массива.
 * 4. Дано целое число. Вывести его строку-описание вида «отрицательное четное
 * число», «отрицательное нечетное число» «нулевое число», «положительное нечетное число»,
 * «положительное четное число». int a = 34 à «положительное четное число»
 * 5. Создайте класс Car. В классе есть конструктор с параметрами массы,
 * скорости. В классе с функцией main создайте экземпляр этого класса и задайте там
 * параметры в конструктор. Напишите функции движения и остановки автомобиля.
 **/

fun main() {

    // 1 задание
    val box = Box(12.0, 12.0, 12.0)
    println("1 задание : ${box.calculateVolume()}")

    // 2 задание
    val array = arrayOf(1, 2, 3, 4, 5)
    println(
        "2 задание : Минимальное число = ${array.min()} " +
                "Максимальное число ${array.max()}"
    )

    // 3 задание
    val arrayInt = intArrayOf(3, 67, 1, 55, 65, 89, 23)
    print("3 задание : ")
    arrayInt.forEach { it -> print("$it ") }
    println()

    // 4 задание
    val a = 0
    println("4 задание : ${typeDigit(a)}")

    // 5 задание
    println("5 задание:")
    val car = Car(1200.0, 100.0)
    car.drive()
    car.stop()
}

fun typeDigit(digit: Int): String {
    when {
        (digit < 0 && digit % 2 == 0) -> return "Отрицательное четное число"
        (digit < 0 && digit % 2 != 0) -> return "Отрицательное нечетное число"
        (digit > 0 && digit % 2 == 0) -> return "Положительное четное число"
        (digit > 0 && digit % 2 != 0) -> return "Положительное нечетное число"
    }
    return "Нулевое число"
}