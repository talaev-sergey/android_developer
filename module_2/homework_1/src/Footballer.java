/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * <p>
 * Создать классы наследники Footballer, HockeyPlayer, Skier.
 * В каждом из них написать свой дополнительный
 * (относящийся к конкретному классу) метод, например, у класса Footballer
 * может быть метод scoringGoals, характеризующий результативную игру
 * забиванием голов, у других классов методы будут свои.
 **/
public class Footballer extends Sportsman {

    // Кол-во голов в сезоне
    private int seasonGoals;

    public Footballer(String name, String team, int age) {
        super(name, team, age);
    }

    public int getSeasonGoals() {
        return seasonGoals;
    }

    public void setSeasonGoals(int seasonGoals) {
        this.seasonGoals = seasonGoals;
    }

    @Override
    public void performAction() {
        System.out.println("Забил гол!");
    }
}
