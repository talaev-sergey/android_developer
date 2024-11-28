/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * <p>
 * Создать классы Human, Fish, Bird с полями имени,
 * возраста (можно добавить любые поля по своему усмотрению)
 **/
public class Human implements Swimmable, Flyable {

    private String firstName; // Имя
    private String lastName; // Фамилия
    private int age; // Возраст

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void swim() {
        System.out.println("Умеет плавать на спине");
    }

    @Override
    public void fly() {
        System.out.println("Умеет летать с помощью летательного транспорта");
    }
}
