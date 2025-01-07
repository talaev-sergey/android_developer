/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 **/
open class Smartphone() {

    var manufacturingCountry: String = ""
    var model: String = ""

    constructor(
        manufacturingCountry: String,
        model: String
    ) : this() {
        this.manufacturingCountry = manufacturingCountry
        this.model = model
    }

    fun call() {
        println("$model совершает звонок")
    }
}