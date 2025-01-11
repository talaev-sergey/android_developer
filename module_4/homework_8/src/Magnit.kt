/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 **/
class Magnit(nameShop: String, adressShop: String) :
    Shop(nameShop, adressShop) {
    override fun getWebsite(): String {
        return "https://magnit.ru/"
    }

    override fun nightModeEnabled(): Boolean {
        return true
    }
}