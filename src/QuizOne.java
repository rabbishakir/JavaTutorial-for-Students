import java.util.Scanner;

public class QuizOne {
    public static void main(String[] args) {
        System.out.println("\"Welcome to Quiz Bangla\"");

        System.out.println("Answer with True and False");

        System.out.println("Question 01: Dhaka is the capital of Bangladesh");

        Scanner scnner = new Scanner(System.in);
        boolean answer = scnner.nextBoolean();
        int count =0;
        if(answer){
            count++;
        }else{
            count=count;
        }
        System.out.println("Question 02: Sylhet is the City of Mosque");
        answer = scnner.nextBoolean();
        if(!answer){
            count++;
        }else{
            count=count;
        }
        System.out.println("Question 03: Java is the Capital Sensative");
        answer = scnner.nextBoolean();
        if(answer){
            count++;
        }else{
            count=count;
        }
        System.out.println("Your correct answer is: "+count);


        System.out.println("welcome again");

        System.out.println("Dhaka is the capital of Bangladesh");
        boolean answer1 = scnner.nextBoolean(); // got the answer of question1
        System.out.println("Sylhet is the city of Mosque");
        boolean answer2 = scnner.nextBoolean(); // got the answer of question2
        System.out.println("java is Case Sensative");
        boolean answer3 = scnner.nextBoolean(); // got the answer of question3

        int mark = 0;

        if(answer1==true){
            mark++;
        }else{
            mark=mark;
        }

        if (answer2==true) {
            mark=mark;
        }else{
            mark++;
        }

        if (answer3==true) {
            mark++;
        } else {
            mark=mark;
        }
        System.out.println("Your correct answer is: "+mark);

    }
}
