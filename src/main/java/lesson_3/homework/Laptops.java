package lesson_3.homework;

public class Laptops extends LaptopTablets {
    LaptopTablets lt = new LaptopTablets();
    Laptops () {name = "Ноутбуки и планшеты";
        iconDescription = "Ноутбуки";
    }

    @Override
    public void open() {
        System.out.println("Открыта страница " + iconDescription);
    }
}
