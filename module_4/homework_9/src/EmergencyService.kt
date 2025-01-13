/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 **/
abstract class EmergencyService(val name: String, val phone: String) :
    Description {
    abstract fun respondToEmergency(): String
}