package SmartPhone;

class ContactList{

    int contactID;
    String contactName;
    String contactAddress;
    public ContactList(int contactID, String contactName, String contactAddress ){
        this.contactID = contactID;
        this.contactName = contactName;
        this.contactAddress = contactAddress;
    }



}


/*



  // contact list add contacts
        ArrayList<ContactList> clist = new ArrayList<>();

        clist.add(new ContactList(100, "Rabbi","20/46 Rupnagar Residential area"));
        clist.add(new ContactList(101, "Robin","20/46 Rupnagar Residential area"));
        clist.add(new ContactList(103, "Robin33","20/46 Ru33pnagar Residential area"));

        // contact list show contacts
        for(ContactList contact:clist){
           System.out.println(contact.contactName + " " + contact.contactAddress);
        }







 */
