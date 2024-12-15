import java.util.Arrays;

/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * 1. Дан массив целых чисел. Найти максимальное число из четных в этом массиве.
 * 2. Дана строка "Привет, Александр, с праздником, с Новым Годом".
 * Написать программу, которая поменяет регистр символов.
 * Т.е. результат должен быть таким: пРИВЕТ, аЛЕКСАНДР, С ПРАЗДНИКОМ, С нОВЫМ гОДОМ.
 **/
public class Main {

    public static void main(String[] args) {
        // 1 задание
        int[] arrayDigits = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        long maxDigit =
                Arrays.stream(arrayDigits).filter(n -> n % 2 == 0).max().getAsInt();
        System.out.println("1 задание : " + maxDigit);

        // 2 задание
        String string = "Привет, Александр, с праздником, с Новым Годом";
        String formattedString = "";
        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if (Character.isUpperCase(string.charAt(i))) {
                formattedString += Character.toLowerCase(letter);
            } else {
                formattedString += Character.toUpperCase(letter);
            }
        }
        System.out.println("2 задание : " + formattedString);
    }
}
