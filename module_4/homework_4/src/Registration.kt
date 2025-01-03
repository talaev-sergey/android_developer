/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 **/
class Registration {
    private var email: String = ""
    private var password: String = ""

    fun getEmail() = email.uppercase()
    fun setEmail(email: String) {
        this.email = email
    }

    fun getPassword() = password
    fun setPassword(password: String) {
        if (password.length >= 6) {
            this.password = password
        } else println("Длина пароля должна быть не менее 6 символов")
    }
}