package oop;

import javax.swing.*;

public class PhoneTest {
    public static void main(String[] args) {
        // greetMessage();
        // made object from the Phone class object er naam phone1 and eitar data type holo phone
        Phone phone1 = new Phone();
        phone1.call(480341043);
        phone1.text(480341043,"This is my first text message");
        phone1.showModel();


    }

    // static dile access pabe in the main class
    // static methods are call from the class we dont need to make object of the class
    // void is there because it does not have a return type

    // in the OOP there will be more veriable type depending on how they can be accessed by the methods
    // 1: Class veriable-> that will be inside the class but not inside a method even not inside the main method
    // it will start with the static key word ex: static String Greeting;
    // 2: Local veriable -> this veriables will be inside a method and can only be used by the method. other methods will not be able to know about it
    // 3: constant veriable or final veriable or class constant-> you need to define a constant that can not be changed later. Use static final VERIABLE_NAME = value

    public static void greetMessage(){
        JOptionPane.showMessageDialog(null,"Hello World","Greetings",JOptionPane.INFORMATION_MESSAGE);
    }
}
