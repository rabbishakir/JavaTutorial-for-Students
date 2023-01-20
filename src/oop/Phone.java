package oop;

import javax.swing.*;

public class Phone {

    static String model = "iPhone 13 Pro Max";  //static korte hoisay because ei veriable ekta static method e use hoisay


    // Properties are below

    // Methods are below
    public void call(int number){
        //System.out.println("Calling"+name);
        JOptionPane.showMessageDialog(null,"Calling "+ number,"Phone Dialer",JOptionPane.INFORMATION_MESSAGE);
    }
    public void text(int number, String message){
        JOptionPane.showMessageDialog(null, message,"To: "+ number ,JOptionPane.INFORMATION_MESSAGE);
    }

    public static void showModel(){
        System.out.println(model);
    }

}
