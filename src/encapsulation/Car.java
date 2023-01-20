package encapsulation;

public class Car {

    // properties

    // defaul value na dile o hobe

    private String name = "Bmw";
    private String model = "M7";

    private int milage = 16000;
    private int price = 800000;

    private boolean isAutomatic = true;
    private boolean is4wd = true;


    // own methods
    public void carGreeting() {
        System.out.println("This is a greeting from your car");
    }

    // getter and setter methods to give access to other class



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public boolean is4wd() {
        return is4wd;
    }

    public void setIs4wd(boolean is4wd) {
        this.is4wd = is4wd;
    }
}
