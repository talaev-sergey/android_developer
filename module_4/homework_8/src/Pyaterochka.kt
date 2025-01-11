/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 **/
class Pyaterochka(nameShop: String, adressShop: String) :
    Shop(nameShop, adressShop) {
    override fun getWebsite(): String {
        return "https://5ka.ru/"
    }

    override fun nightModeEnabled(): Boolean {
        return true
    }
}