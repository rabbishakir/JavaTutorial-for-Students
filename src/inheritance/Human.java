package inheritance;

public class Human {

    private String name;


    public Human(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void eat(){
        System.out.println(this.name + " is Eating");
    }

    public void sleep(){
        System.out.println(this.name + " is sleeping");
    }


}
