package Arrays;

public class array {
    public void sendText(int[] to, String message){
        int i;
        for (i=0; i<5; i++){
            // System.out.println(i);
            System.out.println("Sending text to:" + to[i] + ". Message: " + message );
        }

        // we can say foreach loop
        for(int yyy : to){
            System.out.print("simplied " +  yyy);
            System.out.println(" simplied Message " +  message);
        }
    }
}
