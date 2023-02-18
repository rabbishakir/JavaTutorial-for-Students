package SmartPhone;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MyPhone {



    public static void main(String[] args) {

        // making an object of MyPhoneClass
        MyPhoneClass phoneFunction =new MyPhoneClass("Opensource",true,true, true );

        // calling a number
        phoneFunction.callNumber(124567890);

        // sending a message
        phoneFunction.sendMessage(1234567, "This is a Text message to inform you that you are fucked");

        // sending group messages
        // we need to provide numbers and messages

        // array of phone numbers
        int[] numbers = new int[3];
        numbers[0] = 123456;
        numbers[1] = 569895;
        numbers[2] = 789456;

        // array of messages to send
        String[] messages = new String[3];
        messages[0] = "This is message 01";
        messages[1] = "this is message 02";
        messages[2] = "this is message 03";

        phoneFunction.groupMessage(numbers,messages);

        // contact list add contacts
        ArrayList<ContactList> clist = new ArrayList<>();
        clist.add(new ContactList(100, "Rabbi","20/46 Rupnagar Residential area"));
        clist.add(new ContactList(101, "Robin","20/46 Rupnagar Residential area"));
        clist.add(new ContactList(103, "Robin33","20/46 Ru33pnagar Residential area"));

        // contact list show contacts
        for(ContactList contact:clist){
           System.out.println(contact.contactName + " " + contact.contactAddress);
        }

        MyPhoneClass samsungPhone = new MyPhoneClass("Samsung", true,  true, true);
        samsungPhone.showSettings();

        MyPhoneClass iphone = new MyPhoneClass("Iphone", false, true, true);
        iphone.showSettings();

        MyPhoneClass nokia = new MyPhoneClass("Nokia", false, false,false);
        nokia.showSettings();












    }

}












