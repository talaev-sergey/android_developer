/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * <p>
 * Создать класс Sportsman с полями строкового типа name, team,
 * поле age – целое число, все поля отмечены модификатором private.
 * Cоздать конструктор класса и методы get для доступа к полям класса.
 * В классе есть метод, описывающий общее действие спортсмена.
 **/
public class Sportsman {

    private String name;
    private String team;
    private int age;

    public Sportsman(String name, String team, int age) {
        this.name = name;
        this.team = team;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getAge() {
        return age;
    }

    public void performAction() {
        System.out.println("Спортсмен совершил действие");
    }
}
