import java.lang.reflect.Array;

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
public class Generic<T, V> {
    private T[] objectT;
    private V[] objectV;

    public Generic() {

    }

    public Generic(T[] objectT, V[] objectV) {
        this.objectT = objectT;
        this.objectV = objectV;
    }

    public boolean isArraysEqual(T[] arrayFirst, V[] arraySecond) {
        if (arrayFirst.length == arraySecond.length) {
            int step = 0;
            for (T i : arrayFirst) {
                if (i != arraySecond[step]) {
                    return false;
                }
                step++;
            }
        } else return false;
        return true;
    }

    public String swapElements(T[] array, int fromIndex, int toIndex) {
        String returnString = "";

        if (!(array.length == 0 && fromIndex > array.length && toIndex > array.length)) {
            Object value = array[toIndex];
            array[toIndex] = array[fromIndex];
            array[fromIndex] = (T) value;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }

        for (T i : array) {
            returnString += " " + i;
        }
        return returnString;
    }
}
