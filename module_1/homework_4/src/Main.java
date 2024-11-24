/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль
 * Домашнее задание:
 * <p>
 * Создать массив объектов класса Gamer и включить в него не менее пяти объектов
 * класса Gamer с разными nickname и isActive
 * (например, двое будут в игре, т.е. true, двое - нет).
 * Вывести в консоль имена игроков, которые находятся в игре.
 **/
public class Main {

    public static void main(String[] args) {

        Gamer[] gamers = {
                new Gamer("Петров", true),
                new Gamer("Сидоров", true),
                new Gamer("Зайцев", false),
                new Gamer("Королев", true),
                new Gamer("Васин", false),
                new Gamer("Иванов", false),
        };
        System.out.println("Находяться в игре :");
        for (Gamer gamer : gamers) {
            if (gamer.isActive()) {
                System.out.println(gamer.getNickname());
            }
        }
    }
}
