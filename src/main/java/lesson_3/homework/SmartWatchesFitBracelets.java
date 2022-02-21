package lesson_3.homework;

public class SmartWatchesFitBracelets extends SmartPhonesWatches {

    SmartWatchesFitBracelets () {name = "Смартфоны и смарт-часы";
        iconDescription = "Смарт-часы и фитнес-браслеты";
    }

    @Override
    public void open() {
        System.out.println("Открыта страница " + iconDescription);
    }
}
