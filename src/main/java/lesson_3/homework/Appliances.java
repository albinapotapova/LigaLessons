package lesson_3.homework;

public class Appliances extends Category{

    Appliances() {name = "Бытовая техника";
    }

    @Override
    public void open() {
         System.out.println("Открыта страница " + name);
    }

}
