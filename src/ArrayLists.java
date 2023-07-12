import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        System.out.println("this is to try array list");
        // Making a scanner object called sc
        Scanner sc = new Scanner(System.in);
        // Making a aList object from Arraylist class
        ArrayList<String> aLisst = new ArrayList<String>();

        aLisst.add("Toyota");  
        aLisst.add("Yamaha"); 
        aLisst.add("BMW");
        aLisst.add("Nissan");

        System.out.println(aLisst);

        System.out.println("_______");

        aLisst.remove("BMW");
        System.out.println(aLisst);
        System.out.println("_______");
        aLisst.add("MBW");

        // simplified for loop

        for(String xxx: aLisst){
            System.out.println(xxx);
        }
        System.out.println("_______");

        aLisst.set(0,"OPEL");
        System.out.println(aLisst);

        System.out.println("_______");

        Collections.sort(aLisst);
        for (String sortedList : aLisst){
            System.out.println(sortedList);
        }


        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }



    }
}
