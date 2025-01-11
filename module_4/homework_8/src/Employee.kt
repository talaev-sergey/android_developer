/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 **/
class Employee(firstName: String, lastName: String, age: Int) :
    Person(firstName, lastName, age) {
    override fun workplace(place: String) {
        println("Место работы - $place")
    }

    override fun assignPosition(position: String) {
        println("Получил должность - $position")
    }

    override fun getDuties(duties: String) {
        println("Обязанности : $duties")
    }
}