import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * <p>
 * 1. Создайте список типа String, например, названия пищевых продуктов.
 * Напишите программу для подсчета количества строк в списке,
 * начинающихся с определенной буквы, с использованием потоков.
 * <p>
 * 2. Создать класс Person с полями name и age. В классе с методом main создать
 * список, состоящий не менее, чем из 10 объектов класса Person с произвольными данными.
 * Отфильтровать и вывести в консоль объекты Person, возраст которых более 30 лет.
 **/
public class Main {


    public static void main(String[] args) {
        // 1 задание
        List<String> listProducts = Arrays.asList("Хлеб", "Молоко", "Масло",
                "Яйца", "Сахар", "Соль");
        long count = listProducts.stream()
                .filter(s -> s.toUpperCase().startsWith("М"))
                .count();
        System.out.println("1 задание : " + count);

        // 2 задание
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Василий", 18));
        personList.add(new Person("Игорь", 38));
        personList.add(new Person("Мария", 28));
        personList.add(new Person("Сергей", 30));
        personList.add(new Person("Ирина", 40));
        personList.add(new Person("Георгий", 19));
        personList.add(new Person("Дмитрий", 23));
        personList.add(new Person("Родион", 33));
        personList.add(new Person("Любовь", 43));
        personList.add(new Person("Соня", 19));

        System.out.print("2 задание : ");
        personList.stream()
                .filter(person -> person.getAge() > 30)
                .map(person -> person.getName() + " " + person.getAge() + " ")
                .forEach(System.out::print);
    }
}


