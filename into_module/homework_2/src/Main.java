/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль
 * Домашнее задание:
 * 1. Создать переменные следующих типов: int, double, char с произвольными
 * значениями. Создать переменную result типа double, которая будет содержать
 * сумму вышеуказанных переменных. Вывести в консоль переменную result.
 * <p>
 * 2. Даны переменные a = 5 и b = 12. Создать переменную логического типа check,
 * которая будет содержать результат сравнения переменных a и b. Вывести в консоль переменную check.
 * <p>
 * 3. Дана переменная a = 6. Необходимо выполнить последовательность операций с
 * переменной a. Сначала прибавить к ней 6, затем вычесть 2, разделить на 5, умножить на 7.
 **/
public class Main {
    public static void main(String[] args) {
        // 1 задание
        int intNum = 3;
        double doubleNum = 23.34;
        char charNum = 4;
        double result = intNum + doubleNum + charNum;
        System.out.println(result);
        // 2 задание
        int a = 5, b = 12;
        boolean check = (a == b);
        System.out.println(check);
        // 3 задание
        a = 6;
        a += 6;
        a -= 2;
        a /= 5;
        a *= 7;
    }
}