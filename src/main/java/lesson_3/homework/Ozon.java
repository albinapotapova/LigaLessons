package lesson_3.homework;

public class Ozon {
    static String getName (Category c) {
        return c.getName();
    }
    public static void main(String[] args) {
        Category c1 = new Appliances();
        c1.open();
        String name;
        name = getName(c1);
        System.out.println(name);
//Appliances app = new Appliances();
//app.open();
//SmartPhonesWatches smart = new SmartPhonesWatches();
//smart.open();

    }
}
