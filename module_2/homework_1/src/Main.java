/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * <p>
 * В классе с методом main создать экземпляры классов – наследников,
 * по 2 на каждый класс. Вывести информацию о каждом экземпляре класса
 * и действие всех имеющихся методов.
 **/
public class Main {

    public static void main(String[] args) {

        //  Футболисты
        Footballer cristianoRonaldo = new Footballer("Криштиану Роналду",
                "Ан-Наср", 39);
        Footballer lionelMessi = new Footballer("Лионель Месси", "Интер"
                , 37);

        System.out.print(cristianoRonaldo.getName() + " "
                + cristianoRonaldo.getAge() + " лет"
                + " из команды " + cristianoRonaldo.getTeam() + "\n");
        cristianoRonaldo.performAction();

        System.out.print(lionelMessi.getName() + " "
                + lionelMessi.getAge() + " лет"
                + " из команды " + lionelMessi.getTeam() + "\n");
        lionelMessi.performAction();

        //  Хоккеисты
        Hockeyplayer jaromirJagr = new Hockeyplayer("Яроми́р Ягр",
                "Флорида Пантерз", 30);
        Hockeyplayer brendanShanahan = new Hockeyplayer("Бре́ндан Шэ́нахэн",
                "Нью-Джерси Девилз", 30);

        System.out.print(jaromirJagr.getName() + " "
                + jaromirJagr.getAge() + " лет"
                + " из команды " + jaromirJagr.getTeam() + "\n");
        jaromirJagr.performAction();

        System.out.print(brendanShanahan.getName() + " "
                + brendanShanahan.getAge() + " лет"
                + " из команды " + brendanShanahan.getTeam() + "\n");
        brendanShanahan.performAction();

        //  Лыжники
        Skier alexanderBolshunov = new Skier("Алекса́ндр Большуно́в",
                "Сборная России", 27);
        Skier sergeyUstiugov = new Skier("Серге́й Устю́гов",
                "Динамо", 32);

        System.out.print(alexanderBolshunov.getName() + " "
                + alexanderBolshunov.getAge() + " лет"
                + " из команды " + alexanderBolshunov.getTeam() + "\n");
        alexanderBolshunov.performAction();

        System.out.print(sergeyUstiugov.getName() + " "
                + sergeyUstiugov.getAge() + " лет"
                + " из команды " + sergeyUstiugov.getTeam() + "\n");
        sergeyUstiugov.performAction();
    }
}
