import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * 1. Напишите программу для вычисления суммы всех четных и нечетных чисел в
 * списке с использованием потоков.
 * 2. Напишите программу для удаления всех повторяющихся элементов из списка с
 * помощью потоков.
 **/
public class Main {

    public static void main(String[] args) {

        // 1 задание
        List<Integer> arrayDigits = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int evenSum = arrayDigits.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        int oddSum = arrayDigits.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("1 задание :\n" + "Сумма четных чисел : " + evenSum
                + "\nСумма нечетных чисел : " + oddSum);

        // 2 задание
        System.out.println("2 задание :");
        Stream<String> arrayString = Stream.of("Яблоко", "Слива", "Банан",
                "Слива");
        arrayString.distinct().forEach(System.out::println);
    }
}
