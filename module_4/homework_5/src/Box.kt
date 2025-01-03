/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 **/
class Box(val width: Double, val height: Double, val depth: Double) {
    fun calculateVolume(): Double {
        return width * height * depth
    }
}