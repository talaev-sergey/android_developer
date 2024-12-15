import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * <p>
 * 1. Напишите программу, реализующую лямбда-выражение для вычисления суммы
 * всех четных элементов списка.
 * 2. Напишите программу, реализующую лямбда-выражение для определения самого
 * длинного слова в списке, состоящего из нескольких слов.
 **/
public class Main {


    public static void main(String[] args) {

        // 1 задание
        Calculator calculator = list -> {
            int result = 0;
            for (int i : list) {
                if (i % 2 == 0) result += i;
            }
            return result;
        };
        List<Integer> integerList = Arrays.asList(22, 5, 4, 7, 8, 9);
        System.out.println("1 задание : " + calculator.sumEvenNumbers(integerList));

        // 2 задание
        Words words = list -> {
            return list.stream()
                    .max(Comparator.comparingInt(String::length))
                    .orElse("Все слова одинаковой длины");
        };

        List<String> stringList = Arrays.asList("восьмидесятичетырёхлетний",
                "автоэлектростеклоподъёмник",
                "рентгеноэлектрокардиографический",
                "Тетрагидропиранилциклопентилтетрагидропиридопиридиновые");
        System.out.println("2 задание : " + words.findLongWord(stringList));

    }

    @FunctionalInterface
    interface Calculator {
        int sumEvenNumbers(List<Integer> list);
    }

    @FunctionalInterface
    interface Words {
        String findLongWord(List<String> list);
    }
}

