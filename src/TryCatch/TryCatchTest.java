package TryCatch;

public class TryCatchTest {
    public static void main(String[] args) {

        try{
            int number1 = 10;
            int number2 =0;
            int DevideAns = number1/number2;
            System.out.println(DevideAns);
        }catch (Exception letsSeeTheException){
            System.out.println(letsSeeTheException);
        }

        System.out.println("This is the line we want to execute");
    }
}
