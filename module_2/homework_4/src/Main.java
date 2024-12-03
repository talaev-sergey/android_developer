import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * Необходимо написать программу, которая дописывает файл. Программа предлагает
 * записать данные фразой "Вводите данные для записи".
 * После того, как введены данные в консоль
 * (необходимо использовать класс Scanner для ввода данных в консоль),
 * программа предлагает дополнить информацию фразой
 * «Введите что-нибудь еще» и данные можно дописать.
 * Вся работа по заполнению файла ведется в бесконечном цикле.
 * Если пользователь введет 0, программа завершается строкой «Файл создан».
 **/
public class Main {

    public static void main(String[] args) throws IOException {

        String pathFile = "src/File.txt";
        Scanner scanner = new Scanner(System.in);

        try {
            File newFile = new File(pathFile);
            FileWriter fileWriter = new FileWriter(newFile, true);
            System.out.println("Введите данные для записи(введите 0 для " +
                    "завершения):");
            while (true) {
                String input = scanner.nextLine();
                if (input.equals("0")) {
                    System.out.println("Файл создан.");
                    fileWriter.close();
                    break;
                }
                fileWriter.write(input + "\n");
                fileWriter.flush();
                System.out.println("Введите что-нибудь еще (введите 0 для " +
                        "завершения):");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при работе с файлом: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
