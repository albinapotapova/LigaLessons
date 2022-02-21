package lesson_3.homework;

public class Tablets extends LaptopTablets {
    Tablets () {name = "Ноутбуки и планшеты";
        iconDescription = "Планшеты";
    }

    @Override
    public void open() {
        System.out.println("Открыта страница " + iconDescription);
    }
}
