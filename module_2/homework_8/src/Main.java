import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * 1. Создайте HashMap c ключами Integer, значениями – String.
 * Напишите метод, который возвращает набор ключей, содержащихся в этой карте.
 * <p>
 * 2. Создайте HashMap c ключами Integer, значениями – String.
 * Напишите метод, который возвращает ассоциативный массив,
 * состоящий из элементов исходного map, при условии,
 * что туда войдут элементы с длиной строки более 3.
 **/
public class Main {


    static Set<Integer> getKeysHashMap(HashMap<Integer, String> hashMap) {
        Set<Integer> keys = hashMap.keySet();
        return keys;
    }

    static HashMap<Integer, String> sortHashMap(HashMap<Integer, String> hashMap) {
        HashMap<Integer, String> resultHashMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            if (entry.getValue().length() > 3) {
                resultHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return resultHashMap;
    }

    public static void main(String[] args) {

        // 1 задание
        String[] arrayFruits = {"Яблоко", "Банан", "Персик", "Груша"};
        HashMap<Integer, String> mapFruits = new HashMap<>();
        for (int i = 0; i < arrayFruits.length; i++) {
            mapFruits.put(i, arrayFruits[i]);
        }
        System.out.println("1 задание : " + getKeysHashMap(mapFruits));

        // 2 задание
        String[] arrayWords = {"Один", "Два", "Три", "Четыре"};
        HashMap<Integer, String> mapWords = new HashMap<>();
        for (int j = 0; j < arrayWords.length; j++) {
            mapWords.put(j, arrayWords[j]);
        }
        System.out.println("2 задание : " + sortHashMap(mapWords));
    }
}
