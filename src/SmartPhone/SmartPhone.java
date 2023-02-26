package SmartPhone;

public class SmartPhone extends Phone {

    boolean isNfc = false;
    boolean isPaymentEnable =false;

    public SmartPhone(String model, boolean isNfc, boolean isPaymentEnable) {
        super(model);
        this.isNfc = isNfc;
        this.isPaymentEnable = isPaymentEnable;
    }

    //take photo
    public void takePhoto(){
        System.out.println(super.model + " Taking Photo using camera");
    }

    @Override
    public void showSettings() {
        super.showSettings();
        System.out.println("GPS Available");
        System.out.println("Camera Available");
        System.out.println("Internet Available");
        System.out.println("Touch Available");

        if(this.isNfc == true){
            System.out.println("NFC Available");
        }
        if(this.isPaymentEnable == true){
            System.out.println("Payment Available");
        }

    }
}
