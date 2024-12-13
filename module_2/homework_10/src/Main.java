/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * <p>
 * 1. Написать функциональный интерфейс Printable с методом print().
 * В классе с методом main создать несколько анонимных классов с различными
 * реализациями метода print().
 * <p>
 * 2. Написать функциональный интерфейс Concationble с методом concat(),
 * который объединяет две строковых переменных, передаваемых в параметры метода
 * и возвращает строку. В классе с методом main создать несколько анонимных
 * классов с различными реализациями метода concat().
 **/
public class Main {

    public static void main(String[] args) {
        // 1 задание
        Printable printString = new Printable() {
            @Override
            public void print() {
                System.out.println("Функциональный интерфейс");
            }
        };
        printString.print();

        Printable printDigit = new Printable() {
            @Override
            public void print() {
                System.out.println(123);
            }
        };
        printDigit.print();

        // 2 задание
        Concationble simpleConcat = new Concationble() {
            @Override
            public String concat(String s, String s2) {
                return s + s2;
            }
        };

        Concationble concatWithSpace = new Concationble() {
            @Override
            public String concat(String s, String s2) {
                return s + " " + s2;
            }
        };

        Concationble concatWithHyphen = new Concationble() {
            @Override
            public String concat(String s, String s2) {
                return s + "-" + s2;
            }
        };

        System.out.println(simpleConcat.concat("Объединение строк", "простое"));
        System.out.println(concatWithSpace.concat("Объединение строк", "с пробелом"));
        System.out.println(concatWithHyphen.concat("Объединение строк", "с дефисом"));
    }

    @FunctionalInterface
    interface Printable {
        void print();
    }

    @FunctionalInterface
    interface Concationble {
        String concat(String strA, String strB);
    }
}
