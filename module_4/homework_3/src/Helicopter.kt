/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 **/
class Helicopter {
    var nameTransport: String = ""
    var takeoffWeight: Int = 0
    var flightSpeed: Double = 0.0
    var maxFlightAltitude: Double = 0.0
    override fun toString(): String {
        return "Спроектировали вертолет с названием = $nameTransport, " +
                "весом = $takeoffWeight кг, " +
                "со скоростью полета = $flightSpeed км/ч, " +
                "высотой полета = $maxFlightAltitude м"
    }
}