import java.util.ArrayList;
import java.util.List;

/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * <p>
 * 1. Необходимо написать метод, который возвращает позицию буквы алфавита.
 * Для реализации программы создать enum алфавита.
 * <p>
 * 2. Написать класс Person с полями имени(name), возраста(age).
 * Для определения пола Person создать enum Gender с соответствующими константами.
 * В классе с методом main создать список объектов Person, состоящий не менее,
 * чем из 10 человек разного пола. Написать метод, возвращающий список объектов
 * класса Person в зависимости от введенного параметра пола, т.е. список мужчин или женщин.
 **/
public class Main {

    enum Letter {
        A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U,
        V, W, X, Y, Z;
    }

    static int getIndexLatter(String latter) {
        try {
            return Letter.valueOf(latter).ordinal();
        } catch (IllegalArgumentException e) {
            System.out.println("Такой буквы нет в алфавите");
        }
        return -1;
    }

    static void sortByGender(List<Person> listPerson, Person.Gender gender) {
        for (int i = 0; i < listPerson.size(); i++) {
            if (listPerson.get(i).getGender().equals(gender)) {
                System.out.println(listPerson.get(i));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("1 задание : " + getIndexLatter("L"));

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Василий", 18, Person.Gender.MALE));
        personList.add(new Person("Игорь", 38, Person.Gender.MALE));
        personList.add(new Person("Мария", 28, Person.Gender.FEMALE));
        personList.add(new Person("Сергей", 30, Person.Gender.MALE));
        personList.add(new Person("Ирина", 40, Person.Gender.FEMALE));
        personList.add(new Person("Георгий", 19, Person.Gender.MALE));
        personList.add(new Person("Дмитрий", 23, Person.Gender.MALE));
        personList.add(new Person("Родион", 33, Person.Gender.MALE));
        personList.add(new Person("Любовь", 43, Person.Gender.FEMALE));
        personList.add(new Person("Соня", 19, Person.Gender.FEMALE));

        System.out.println("2 задание :");
        System.out.println("Мужчины:");
        sortByGender(personList, Person.Gender.MALE);
        System.out.println("Женщины:");
        sortByGender(personList, Person.Gender.FEMALE);
    }
}
