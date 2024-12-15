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
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
