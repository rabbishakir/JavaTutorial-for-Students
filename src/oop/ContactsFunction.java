package oop;

import java.util.ArrayList;

public class ContactsFunction {

    private ArrayList<String> contactList = new ArrayList<String>();


    public void addContact(){
        contactList.add("Mithila");
    }
    public void showContacts(){
        System.out.println(contactList);
    }

}
