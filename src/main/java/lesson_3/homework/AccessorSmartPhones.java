package lesson_3.homework;

public class AccessorSmartPhones extends SmartPhonesWatches {
    AccessorSmartPhones() {name = "Смартфоны и смарт-часы";
        iconDescription = "Аксессуары для смартфонов";
    }

    @Override
    public void open() {
        System.out.println("Открыта страница Аксессуары для смартфонов и телефонов");
    }
}
