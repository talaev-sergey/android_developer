/**
 * 2024
 * Талаев Сергей
 * Курс Android-разработчик с 0 до Middle
 * Модуль 2. Синтаксис языка
 * Домашнее задание:
 * <p>
 * Создать классы Human, Fish, Bird с полями имени,
 * возраста (можно добавить любые поля по своему усмотрению)
 **/
public class Fish implements Swimmable {

    private String name;
    private String habitat; // Среда обитания
    private float lenght; // Длина
    private float weight; // Вес

    public Fish(String name, String habitat, float lenght,
                float weight) {
        this.name = name;
        this.habitat = habitat;
        this.lenght = lenght;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getHabitat() {
        return habitat;
    }

    public float getLenght() {
        return lenght;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public void swim() {
        String printInfo = "Плавает в водоемах";
        switch (habitat) {
            case "Река":
                printInfo = "Плавает в реке";
                break;
            case "Море":
                printInfo = "Плавает в море";
                break;
            case "Аквариум":
                printInfo = "Плавает в аквариуме";
                break;
        }
        System.out.println(printInfo);
    }
}
