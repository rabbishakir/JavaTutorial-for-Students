import java.util.Scanner;

public class IfelsePractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your zodiac sign to see the date range");
        String zodiac = scanner.next();

        if(zodiac.equalsIgnoreCase("Aries")){
            System.out.println("Born Between: March 21 – April 19");
        } else if (zodiac.equalsIgnoreCase("Taurus")) {
            System.out.println("Born Between: April 20 – May 20");
        } else if (zodiac.equalsIgnoreCase("Gemini")){
            System.out.println("Born Between: May 21 – June 20");
        } else if (zodiac.equalsIgnoreCase("Cancer")) {
            System.out.println("Born Between: June 21 – July 22");
        } else if (zodiac.equalsIgnoreCase("Leo")) {
            System.out.println("Born Between: July 23 – August 22");
        } else if (zodiac.equalsIgnoreCase("virgo")) {
            System.out.println("Born Between: August 23 – September 22");
        } else if (zodiac.equalsIgnoreCase("Libra")) {
            System.out.println("Born Between: September 23 – October 22");
        } else if (zodiac.equalsIgnoreCase("Scorpio")) {
            System.out.println("Born Between: October 23 – November 21");
        } else if (zodiac.equalsIgnoreCase("Sagittarius")) {
            System.out.println("Born Between: November 22 – December 21");
        } else if (zodiac.equalsIgnoreCase("Capricorn")) {
            System.out.println("Born Between: December 22 – January 19");
        } else if (zodiac.equalsIgnoreCase("Aquarius")) {
            System.out.println("Born Between: January 20 – February 18");
        } else if (zodiac.equalsIgnoreCase("Pisces")) {
            System.out.println("Born Between: February 19 – March 20");
        } else{
            System.out.println("This is not a valid zodiac sign");
        }


    }
}
