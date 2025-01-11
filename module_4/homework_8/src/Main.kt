/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 * 1. Написать абстрактный класс Shop(магазин). Написать несколько свойств
 * класса, две абстрактные функции и одну обычную, характеризующих работу магазина.
 * Создать два класса наследника магазин Magnit и Pyaterochka. Написать реализацию функций.
 * 2. Написать абстрактный класс Person. В конструкторе передать несколько свойств,
 * например, имени, фамилии, возраста. Написать абстрактные функции,характеризующие
 * деятельность объекта класса и одну или несколько обычных.
 * Создать два класса наследника Student и Employee. Написать реализацию функций.
 * 3. Единицы длины пронумерованы следующим образом:
 * 1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр.
 * Дан номер единицы длины (целое число в диапазоне 1–5) и длина отрезка в метрах (дробное число).
 * Найти длину отрезка в тех величинах, под номером которых они находятся.
 **/

fun main() {
    // 1 задание
    println("1 задание:")
    val magnit = Magnit("Магнит Бибирево", "Шенкурский пр., 2, Москва")
    magnit.infoShop()
    val pyaterochka =
        Pyaterochka("Пятерочка Алтуфьево", "Алтуфьевское ш., 84, Москва")
    pyaterochka.infoShop()

    println("2 задание:")
    // 2 задание
    val student = Student("Вася", "Петров", 17)
    student.getInfoPerson()
    student.workplace(magnit.nameShop)
    student.assignPosition("Сотрудник зала")
    student.getDuties("Выкладка товара")

    val employee = Employee("Игорь", "Зайцев", 30)
    employee.getInfoPerson()
    employee.workplace(pyaterochka.nameShop)
    employee.assignPosition("Кассир")
    employee.getDuties("Работа на кассе")

    println("3 задание:")
    // 3 задание
    val measureUnit: Int = 5
    val lengthInMeters: Double = 5.5
    when (measureUnit) {
        1 -> println("Длина в дециметрах = ${lengthInMeters * 10} дц")
        2 -> println("Длина в километрах = ${lengthInMeters / 1000} км")
        3 -> println("Длина в метрах = ${lengthInMeters} м")
        4 -> println("Длина в миллиметрах = ${lengthInMeters * 1000} мм")
        5 -> println("Длина в сантиметрах = ${lengthInMeters * 100} см")
    }
}