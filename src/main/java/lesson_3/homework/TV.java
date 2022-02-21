package lesson_3.homework;

public class TV extends Category {
    TV () {name = "Телевизоры";
    }

    @Override
    public void open() {
        System.out.println("Открыта страница " + name);
    }

}
