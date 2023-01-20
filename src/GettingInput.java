import java.util.Scanner;

public class GettingInput {
    public static void main(String[] args) {
        // getting input with the help of scanner class and make a basic calcualtor
        Scanner scanner = new Scanner(System.in);
        // take first data input
        System.out.println("Input the first number");
        double number1 = scanner.nextDouble();
        System.out.println("Input the Operator");
        char operator = scanner.next().charAt(0);
        System.out.println("Input the second number");
        double number2 = scanner.nextDouble();

        // adding a switch case to perform the operation

        double ans;

        switch (operator) {
            case '+':
                ans = number1 + number2;
                break;


            case '-':
                ans = number1 - number2;
                break;
            case '*':
                ans = number1 * number2;
                break;
            case '/':
                ans = number1 / number2;
                break;
            default:
                System.out.println("No valid Operator");
                return;  // variable ans in initiallized before the switch case and need to return to the scope
        }
        System.out.println("The answer is: "+ ans);


    }
}
