package oop;

import javax.swing.*;
import java.util.ArrayList;

public class Phone {

    static String model = "iPhone 13 Pro Max";  //static korte hoisay because ei veriable ekta static method e use hoisay
    private  String[]  numbers = new String[]{"123", "456", "789"};
    private  String[]  messages = new String[]{"Hello How are you 01", "Hello How are you 01", "Hello How are you 01"};

    // JA BUJHLAM ARRAY JUST INITIALIZE KORA JABE INSIDE CLASS
    // VALUE ASSIGN KORTE HOBE INSIDE METHOD
    private int[] rating = new int[4];




    public void snedgroupSms(){

        this.rating[0] = 100;
        this.rating[1] = 200;
        this.rating[2] = 300;
        this.rating[3] = 400;

        System.out.println(rating[3]);

        for(int i= 0; i<numbers.length; i++){
            System.out.println("TO "+ numbers[i] + " ->  Message " + messages[i]);
        }

    }




    // adding call function
    public void call(int number){
        JOptionPane.showMessageDialog(null,"Calling "+ number,"Phone Dialer",JOptionPane.INFORMATION_MESSAGE);
    }

    // adding text function
    public void text(int number, String message){
        JOptionPane.showMessageDialog(null, message,"To: "+ number ,JOptionPane.INFORMATION_MESSAGE);
    }

    // adding show model function

    public static void showModel(){
        System.out.println(model);
    }




}
