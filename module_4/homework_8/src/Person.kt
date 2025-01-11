/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 **/
abstract class Person(
    var firstName: String,
    var lastName: String,
    var age: Int
) {
    abstract fun workplace(place: String)
    abstract fun assignPosition(position: String)
    abstract fun getDuties(duties: String)
    open fun getInfoPerson() {
        println("Имя: $firstName | Фамилия: $lastName | Возраст: $age")
    }
}