package lesson_3.homework;

public class SmartPhonesWatches extends Category{
    public void nameCategory() {
        name = "Смартфоны и смарт-часы";
    }

    @Override
    public void open() {
        System.out.println("Открыта страница Телефоны и смарт-часы");
    }
}
