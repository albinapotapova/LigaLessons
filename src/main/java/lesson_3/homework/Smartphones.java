package lesson_3.homework;

public class Smartphones extends SmartPhonesWatches{

    Smartphones () {name = "Смартфоны и смарт-часы";
    iconDescription = "Cмартфоны";
    }

    @Override
    public void open() {
        System.out.println("Открыта страница " + iconDescription);
    }
}
