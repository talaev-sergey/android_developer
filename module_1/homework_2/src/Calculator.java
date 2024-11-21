/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 1. Знакомство с языком программирования
 * Домашнее задание:
 * 1. Создать класс Calculator(Калькулятор) для выполнения основных
 * арифметических операций. Он содержит два поля: a и b.
 * <p>
 * 2. Написать методы вычисления суммы, разности, произведения и частного.
 * Методы суммы и разности принимают входные параметры a и b и возвращают
 * результат соответствующих операций. Методы произведения и частного необходимо
 * написать с типом возвращаемого значения void (ничего не возвращают) и
 * результат этих операций внутри метода выводится в консоль методом
 * System.out.println().
 **/
public class Calculator {

    public float a, b;

    public float add(float a, float b) {
        this.a = a;
        this.b = b;
        return this.a + this.b;
    }

    public float subtract(float a, float b) {
        this.a = a;
        this.b = b;
        return this.a - this.b;
    }

    public void multiply(float a, float b) {
        this.a = a;
        this.b = b;
        System.out.println(this.a * this.b);
    }

    public void divide(float a, float b) {
        this.a = a;
        this.b = b;
        System.out.println(this.a / this.b);
    }
}