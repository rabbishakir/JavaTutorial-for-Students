package inheritance;

public class Doctor extends Gender {


    public Doctor(String name) {
        super(name);
    }

    public void howToLooseFat(){
        System.out.println(this.getName() + " Suggest: " + "Cut down carb to 40 grams or less");
    }

    @Override
    public void whatsYourGender() {
        //super.whatsYourGender();
        System.out.println(getName() + " is a female");
    }

}
