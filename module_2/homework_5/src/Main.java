/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * <p>
 * 1. Напишите метод, который принимает два массива одного типа и проверяет,
 * содержат ли они одинаковые элементы в одном и том же порядке.
 * <p>
 * 2. Напишите универсальный метод, чтобы обмениваться позициями двух различных
 * элементов в массиве.
 **/
public class Main {

    public static void main(String[] args) {

        // 1 задание
        Integer[] arrayFirst = {1, 2, 3};
        Integer[] arraySecond = {1, 2, 3};
        Generic<Integer, Integer> arrayEqual = new Generic();
        System.out.println("1 задание : " + arrayEqual.isArraysEqual(arrayFirst,
                arraySecond));

        // 2 задание
        String[] text = {"Раз", "Два", "Три"};
        Generic swapArray = new Generic<>();
        System.out.println("2 задание :" +
                swapArray.swapElements(text, 0, 1));
    }
}
