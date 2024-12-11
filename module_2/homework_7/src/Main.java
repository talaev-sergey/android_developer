import java.util.TreeSet;

/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * <p>
 * 1. Создайте два набора, хранящих в себе элементы строкового типа,
 * характеризующие цвет чего – либо. Напишите метод для сравнения двух наборов
 * и сохранения элементов, которые одинаковы для обоих наборов.
 * <p>
 * 2. Создайте множество целых чисел. Необходимо вывести в консоль все его
 * элементы, которые больше 15 и являются четными. Остальные элементы набора
 * тоже необходимо вывести в консоль, но каждый из них разделив на 2.
 **/
public class Main {

    static Object findCommonElements(TreeSet<String> setA,
                                     TreeSet<String> setB) {
        TreeSet<String> result = new TreeSet<>(setA);
        result.retainAll(setB); // Оставляем только элементы, которые есть в обоих наборах
        if (result.isEmpty()) {
            return new String("Совпадения не найдены.");
        }
        return result;
    }

    public static void main(String[] args) {

        // 1 задание
        TreeSet<String> shoesColor = new TreeSet<>();
        TreeSet<String> pantsColor = new TreeSet<>();

        // Цвета обуви
        shoesColor.add("Черный");
        shoesColor.add("Белый");
        shoesColor.add("Коричневый");
        // Цвета брюк
        pantsColor.add("Черный");
        pantsColor.add("Синий");
        pantsColor.add("Серый");

        System.out.println("1 задание : " + findCommonElements(shoesColor,
                pantsColor));

        // 2 задание
        int[] arrayInt = {23, 4, 56, 7, 0, 43, 46, 123, 45, 6, 1};
        TreeSet<Integer> resultTreeSet = new TreeSet<>();

        for (int i : arrayInt) {
            if (i > 15 && i % 2 == 0) {
                resultTreeSet.add(i);
            } else resultTreeSet.add(i / 2);
        }

        System.out.println("2 задание : " + resultTreeSet);

    }
}
