package SmartPhone;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Phone {
    protected String model ;
    public ArrayList<String> contact = new ArrayList<>();

    public Phone(String model){
        this.model = model;
    }

    // call
    public void callNumber(long phoneNumber){
        System.out.println("calling " + phoneNumber);
    }

    // send message
    public void sendMessage(int number, String message){
        System.out.println("SmS Sent: "+ "To: "+ number + "  " + "Message: "+ message);
    }

    //send group message
    public void groupMessage(int[] numbers, String[] messages){
        int i;
        for (i=0; i<numbers.length;i++){
            System.out.println("Sending Test to: " + numbers[i] + "  " + "Message: " + messages[i]);
        }
    }

    //show settings
    public void showSettings(){
        System.out.println("---- " +this.model + " ----");
        System.out.println("Microphone");
        System.out.println("Speaker");
        System.out.println("Display");
        System.out.println("Message");
        System.out.println("Group Messages");
        System.out.println("Call");
        System.out.println("Contacts");

    }

    //adding contact information

    public void addContact(String name){
       contact.add(name);
    }
    public void showContact(){
        if(contact.size()>0){
            for (String listContact:contact){
                System.out.println(listContact);
            }
        }else{
            System.out.println("No Contacts available");
        }

    }








}




