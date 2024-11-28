/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * В классе с методом main создать экземпляры классов Human, Fish, Bird,
 * вызвать у этих экземпляров имеющиеся методы
 **/
public class Main {

    public static void main(String[] args) {
        Human man = new Human("Иван", "Иванов", 30);
        System.out.println(
                "Имя человека: " + man.getFirstName() + " " + man.getLastName() +
                        "\nВозраст: " + man.getAge());
        man.swim();
        man.fly();
        System.out.println("--------------------------------------");
        Fish perch = new Fish("Окунь", "Река", 15.0f, 2.0f);
        System.out.println(
                "Название рыбы: " + perch.getName() +
                        "\nСреда обитания : " + perch.getHabitat() +
                        "\nДлина: " + perch.getLenght() + " см" +
                        "\nВес: " + perch.getWeight() + " кг");
        perch.swim();
        System.out.println("--------------------------------------");
        Bird seagull = new Bird("Чайка", "Море", 79.0f, 2.0f);
        System.out.println(
                "Название птицы: " + seagull.getName() +
                        "\nСреда обитания : " + seagull.getHabitat() +
                        "\nВысота: " + seagull.getHeight() + " см" +
                        "\nВес: " + seagull.getWeight() + " кг");
        seagull.swim();
        seagull.fly();
    }
}
