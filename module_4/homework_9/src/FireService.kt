/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 **/
class FireService(name: String, phone: String) : EmergencyService(name, phone) {
    private val emergencyType: String = "пожары"
    override fun respondToEmergency(): String {
        return "Служба реагирует на $emergencyType"
    }

    override fun getDiscription(): String {
        return println("Название службы - $name | Номер службы ($phone) | ${respondToEmergency()}")
            .toString()
    }
}