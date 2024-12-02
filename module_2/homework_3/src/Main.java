/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * 1. Напишите метод, который принимает целое число в качестве параметра и
 * выдает
 * исключение, если число нечетное. Необходимо протестировать ее в методе
 * main с разными числами.
 * <p>
 * 2. Напишите метод, который принимает строку в качестве входных данных и
 * выдает исключение, если строка содержит числа.
 **/
public class Main {

    // 1 задание
    static void isOdd(int number) throws Exception {
        if (number % 2 != 0) throw new Exception("Не четное число");
    }

    // 2 задание
    static void containsDigits(String text) throws Exception {
        int length = text.length();
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(text.charAt(i)))
                throw new Exception("В строке имеется цифра : " + text.charAt(i));
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            isOdd(3);
        } catch (Exception e) {
            System.out.println("1 задание : " + e.getMessage());
        }
        try {
            containsDigits("Цифра 10");
        } catch (Exception e) {
            System.out.println("2 задание : " + e.getMessage());
        }
    }
}
