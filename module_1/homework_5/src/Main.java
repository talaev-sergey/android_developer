import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 1.Знакомство с языком программирования
 * Домашнее задание:
 * <p>
 * 1. Дан массив со строками: String[] stringArray = {"ab", "cd", "ef"}.
 * Получите массив символов этих строк: char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'}.
 * <p>
 * 2. Дана строка: String stroke = "12345". Выведите в консоль значение,
 * которое можно, взяв первый и последний символ этой строки в следующем виде. Т.е. "15".
 * <p>
 * 3. Дана некоторая строка - "1203405". Найдите позицию первого нуля в строке.
 * Т.е. позиция первого нуля в этой строке равна 2.
 **/
public class Main {

    public static void main(String[] args) {

        // 1 задание
        String[] stringArray = {"ab", "cd", "ef"};
        int lengthString = 0;

        for (String s : stringArray) {
            lengthString += s.length();
        }

        char[] charArray = new char[lengthString];
        int position = 0;

        for (String c : stringArray) {
            c.getChars(0, c.length(), charArray, position);
            position += c.length();
        }
        System.out.println("1 задание : " + String.valueOf(charArray));

        // 2 задание
        String stroke = "12345";
        char[] result = new char[2];
        result[0] = stroke.charAt(0);
        result[1] = stroke.charAt(stroke.length() - 1);
        System.out.println("2 задание : " + String.valueOf(result));

        // 3 задание
        String anyString = "1203405";
        System.out.println("3 задание : " + anyString.indexOf("0"));
    }
}
