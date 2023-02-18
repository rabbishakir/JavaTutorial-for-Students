package oop;

import java.util.ArrayList;

public class ContactsFunction {

    private ArrayList<String> contactList = new ArrayList<String>();


    public void addContact(String name){
        contactList.add(name);
    }
    public void showContacts(){
        System.out.println(contactList);
    }

}
