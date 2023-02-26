package inheritance;

import SmartPhone.SmartPhone;

public class Doctor extends Human {

    private SmartPhone drIphone = new SmartPhone("Ihone 11",true,true);
    public SmartPhone getDrIphone(){
        return this.drIphone;
    }


    public Doctor(String name) {
        super(name);
    }

    public void howToLooseFat(){
        System.out.println(this.getName() + " Suggest: " + "Cut down carb to 40 grams or less");
    }

//    @Override
//    public void whatsYourGender() {
//        //super.whatsYourGender();
//        System.out.println(getName() + " is a female");
//    }

}
