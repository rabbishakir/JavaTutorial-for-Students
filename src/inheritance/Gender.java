package inheritance;

public class Gender extends Human {

    public Gender(String name) {
        super(name);
    }

    public void whatsYourGender(){
        System.out.println(getName() + " is a male");
    }

}
