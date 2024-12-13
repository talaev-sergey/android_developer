/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * * Домашнее задание:
 * * <p>
 * * 1. Необходимо написать метод, который возвращает позицию буквы алфавита.
 * * Для реализации программы создать enum алфавита.
 * * <p>
 * * 2. Написать класс Person с полями имени(name), возраста(age).
 * * Для определения пола Person создать enum Gender с соответствующими константами.
 * * В классе с методом main создать список объектов Person, состоящий не менее,
 * * чем из 10 человек разного пола. Написать метод, возвращающий список объектов
 * * класса Person в зависимости от введенного параметра пола, т.е. список мужчин или женщин.
 **/
public class Person {

    private String name;
    private int age;
    private Gender gender;

    public enum Gender {
        MALE("Мужской"),
        FEMALE("Женский");

        private final String discription;

        Gender(String discription) {
            this.discription = discription;
        }

        @Override
        public String toString() {
            return discription;
        }
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Персона : " +
                "Имя - " + name +
                ", Возраст - " + age +
                ", Пол - " + gender;
    }
}
