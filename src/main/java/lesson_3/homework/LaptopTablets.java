package lesson_3.homework;

public class LaptopTablets extends Category {
    LaptopTablets(){
        name = "Ноутбуки и планшеты";
    }

    @Override
    public void open() {
        System.out.println("Открыта страница Ноутбуки, планшеты и электронные книги");
    }

}
