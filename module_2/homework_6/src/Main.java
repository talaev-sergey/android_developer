import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * <p>
 * 1. Создайте ArrayList, содержащий разные цвета, тип элемента этого
 * динамического массива – String. Напишите метод для поиска элемента в списке ,
 * содержащем эти цвета. На вход метод принимает параметр поиска.
 * Например, если список содержит «red», «blue», «green» и в аргументы метода
 * передать «red», то метод должен вернуть true, символизируя то, что этот цвет
 * содержится в списке.
 * <p>
 * 2. Создайте LinkedList, содержащий целые числа, т.е. Integer.
 * Напишите метод, который меняет местами первый и последний элементы этого
 * списка и возвращает этот список в новом виде.
 * Т.е., если создали список [1, 2, 3, 4, 5], то в результате должны получить [5, 2, 3, 4, 1].
 **/
public class Main {

    static boolean containsColor(ArrayList<String> colorList, String color) {
        if (colorList.indexOf(color) < 0) {
            return false;
        }
        return true;
    }

    static LinkedList<Integer> swapList(LinkedList<Integer> list) {
        int cache = list.getLast();
        list.set(list.size() - 1, list.getFirst());
        list.set(0, cache);
        return list;
    }

    public static void main(String[] args) {

        // 1 задание
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Белый");
        colors.add("Красный");
        colors.add("Черный");
        colors.add("Желтый");
        System.out.println("1 задание : " + containsColor(colors, "Желтый"));

        // 2 задание
        LinkedList<Integer> listInteger = new LinkedList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        swapList(listInteger);
        System.out.println("2 задание : " + listInteger);
    }
}
