/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 **/
class Pet {
    var name: String = ""
    var weight: Double = 0.0
    var type = "Собака"
    override fun toString(): String {
        return "Домашнее животное: $type, Кличка: $name, Вес: $weight кг"
    }
}