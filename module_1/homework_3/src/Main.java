/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 1. Знакомство с языком программирования
 * Домашнее задание:
 * <p>
 * 1. Дан массив целых чисел int[] array = {3, 87, 12, 98, 2, 4, 66}.
 * Вывести в консоль элементы массива в обратном порядке, т.е. начиная с 66.
 * <p>
 * 2. Дан произвольный массив чисел с плавающей точкой. Необходимо
 * отсортировать его по убыванию.
 * <p>
 * 3. Дан массив целых чисел int[] array = {6, 117, 44, 5, 32, 81, 9}.
 * Необходимо вывести в консоль четные элементы массива.
 **/
public class Main {

    /**
     * 1 задание
     **/
    public static void sortDescending() {
        int[] array = {3, 87, 12, 98, 2, 4, 66};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    /**
     * 2 задание
     **/
    public static void bubbleSort() {
        float[] array = {5.5f, 1.7f, 2.3f, 4.9f, 3.0f};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    float temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 3 задание
     **/
    public static void findEvenNumbers() {
        int[] array = {6, 117, 44, 5, 32, 81, 9};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        sortDescending();
        bubbleSort();
        System.out.println();
        findEvenNumbers();
    }
}
