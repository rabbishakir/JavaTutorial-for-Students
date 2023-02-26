package SmartPhone;
public class MyPhoneTest {



    public static void main(String[] args) {

        SmartPhone iphone = new SmartPhone("Iphone 7",true,true);
        SmartPhone samsung = new SmartPhone("Samsung S9", false, true);
        NonSmartPhone nokia = new NonSmartPhone("Nokia 3310");

        iphone.showSettings();
        samsung.showSettings();
        nokia.showSettings();

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

        nokia.groupMessage(numbers,messages);

        nokia.addContact("Mithila");
        nokia.showContact();

    }

}












