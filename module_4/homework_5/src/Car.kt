/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 **/
class Car(val weight: Double, val speed: Double) {
    fun drive() {
        println("Автомобиль движется со скоростью $speed км/ч")
    }

    fun stop() {
        println("Автомобиль остановился")
    }
}