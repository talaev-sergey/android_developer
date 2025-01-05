/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 **/
class BankCard {
    private val cardNumber: Int = 1234567890
        get() = field
    private val cardPass: Int = 12345
        get() = field

    fun getCardInfo() {
        println("Введите код карты: ")
        val checkPass = readln().toInt()
        if (checkPass == this.cardPass) {
            println("Банковская карта $cardNumber")
        } else println("Неверный пароль")
    }
}