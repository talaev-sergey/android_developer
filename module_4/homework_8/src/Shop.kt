/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 **/
abstract class Shop(var nameShop: String, var adressShop: String) {
    abstract fun getWebsite(): String
    abstract fun nightModeEnabled(): Boolean
    open fun infoShop() {
        println("Магазин - $nameShop")
        println("Адрес магазина - $adressShop")
        println("Сайт магазина - ${getWebsite()}")
        if (nightModeEnabled()) {
            println("Режим работы - круглосуточно")
        } else println("Режим работы - с 10 до 23")
    }
}