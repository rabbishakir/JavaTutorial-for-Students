package SmartPhone;

public class MyPhoneClass {

    // Function to add
    // Call
    // Message
    // Group Message
    // Contact -->> add contact --> Delete contact --> show contact
    // Show Model
    // lets make some property to make pone settings

    boolean isGps = false;
    boolean isCamera = false;
    boolean isInternet = false;
    boolean isNfc = false;
    boolean isTouch = false;
    String model = " ";


    // default constructor when empty
    // when we make an object with new keyword ex Myphone phone = new MyPhone(); <-- this MyPhone() is a default constructor

    public MyPhoneClass(String model, boolean gps, boolean camera, boolean internet){
        this.model = model;
        this.isGps = gps;
        this.isCamera = camera;
        this.isInternet = internet;
    }

    // call
    public void callNumber(long phoneNumber){
        System.out.println("calling " + phoneNumber);
    }

    public void sendMessage(int number, String message){
        System.out.println("SmS Sent: "+ "To: "+ number + "  " + "Message: "+ message);
    }

    public void groupMessage(int[] numbers, String[] messages){
        int i;
        System.out.println(messages.length);

        for (i=0; i<numbers.length;i++){
            System.out.println("Sending Test to: " + numbers[i] + "  " + "Message: " + messages[i]);
        }

    }

    public void showSettings(){
        System.out.println(model);

        if(isGps == true){
            System.out.println("GPS Available");
        }
        if(isInternet == true){
            System.out.println("iNTERNET Available");
        }
        if(isCamera == true){
            System.out.println("CAMERA Available");
        }

        System.out.println("TOUCHSCREEN");
        System.out.println("NFC");

    }



}




