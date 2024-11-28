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
public class Bird implements Swimmable, Flyable {

    private String name;
    private String habitat; // Среда обитания
    private float height; // Высота
    private float weight; // Вес

    public Bird(String name, String habitat, float height, float weight) {
        this.name = name;
        this.habitat = habitat;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getHabitat() {
        return habitat;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public void swim() {
        String printInfo = "Не умеет плавать";
        switch (habitat) {
            case "Река":
                printInfo = "Плавает в реке";
                break;
            case "Море":
                printInfo = "Плавает в море";
                break;
        }
        System.out.println(printInfo);
    }

    @Override
    public void fly() {
        System.out.println("Умеет летать");
    }
}
