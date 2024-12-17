/** 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 3. Kotlin введение. Синтаксис языка.
 * Домашнее задание:
 * В методе main выполните следующие действия:
 *
 *   - Объявите переменную с именем "age" типа Int и присвойте ей значение вашего возраста.
 *
 *   - Объявите переменную с именем "name" типа String и присвойте ей значение вашего имени.
 *
 *   - Объявите переменную с именем "isStudent" типа Boolean и присвойте ей значение true, если вы студент, и false в противном случае.
 *
 *   - Объявите переменную с именем "salary" типа Double и присвойте ей значение вашего месячного дохода (можете выбрать любую сумму).
 *
 *   - Выведите на экран значения всех объявленных переменных, разделяя их, например, символом " | ".
 **/

fun main() {
    val age: Int = 35
    val name: String = "Сергей"
    val isStudent: Boolean = false
    val salary: Double = 100_000.0
    println(
        "Name: " + name + " | Age: " + age + " | Is Student: " + isStudent +
                " | Salary: " + salary
    )
}