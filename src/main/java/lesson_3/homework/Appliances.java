package lesson_3.homework;

public class Appliances extends Category{

    public void nameCategory() {
        name = "Бытовая техника";
    }

    @Override
    public void open() {
         System.out.println("Открыта страница Бытовая техника");
    }

}
