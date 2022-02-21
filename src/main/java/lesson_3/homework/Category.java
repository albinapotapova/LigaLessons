package lesson_3.homework;

public abstract class Category {
    protected String iconDescription;
    protected String name;

    protected String getIconDescription() {
        return iconDescription;
    }

    public void setIconDescription (String iconDescription) {
        this.name = iconDescription;
    }

    protected String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

//    protected String SmartPhonesWatches;
//    protected String TVs;
//    protected String LaptopTablets;
//    protected String Computers;
//    protected String HeadPhonesAudioEquipment;
//    protected String GamesConsole;


    public abstract void open();
}
