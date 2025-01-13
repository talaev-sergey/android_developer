/** 2025
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 4. Функции. ООП
 * Домашнее задание:
 * 1. Создать суперкласс Animal(животное) со свойствами веса и имени. Написать
 * функцию, которая описывает прием пищи животного. Наследовать от него подклассы
 * Dog, Cat, используя все возможности суперкласса. У каждого животного
 * определить по одной своей функции.
 * 2. Создать классы Nokia и Sony. Наследовать каждый из них от суперклассов
 * Smartphone и IPhone. Создать несколько свойств в суперклассах и функцию звонка.
 * 3. Дан массив целых чисел 3, 67, 1, 55, 65, 89, 23. Вывести на экран
 * элементы массива, которые делятся на 5 на цело.
 **/

fun main() {
    // 1 задание
    println("1 задание:")
    val cat = Cat()
    cat.name = "Мурка"
    cat.weight = 1.2
    cat.eat()
    cat.catWash()

    val dog = Dog()
    dog.name = "Шарик"
    dog.weight = 5.0
    dog.eat()
    dog.wagTail()

    // 2 задание
    println("2 задание:")
    val nokia3310 = Nokia("Финляндия", "3310")
    nokia3310.call()
    val sonyGalaxy = Sony("Япония", "Galaxy")
    sonyGalaxy.call()

    // 3 задание
    print("3 задание: ")
    val array = arrayOf(3, 67, 1, 55, 65, 89, 23)
    for (i in array){
        if (i % 5 == 0) print("$i ")
    }
}