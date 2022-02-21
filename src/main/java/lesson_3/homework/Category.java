package lesson_3.homework;

public abstract class Category {
    protected String iconDescription;
    protected String name;

    public String getIconDescription() {
        return iconDescription;
    }

    public void setIconDescription (String iconDescription) {
        this.iconDescription = iconDescription;
    }

    public String getName() { return name;}

    public void setName (String name) {
        this.name = name;
    }


//    protected String Computers;
//    protected String HeadPhonesAudioEquipment;
//    protected String GamesConsole;


    public abstract void open();
}
