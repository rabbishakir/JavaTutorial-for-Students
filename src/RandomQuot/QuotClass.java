package RandomQuot;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class QuotClass {

    private int randomNumber = ThreadLocalRandom.current().nextInt(1,5);
    // keno print holo naah? cz eita kono method er moddhe naah
    // System.out.println(randomNumber);

     ArrayList<String> quotList = new ArrayList<String>();

        public void addQuotetoList(){
            quotList.add("May you live all the days of your life.");
            quotList.add("Lovers have a right to betray you... friends don't.");
            quotList.add("To be interested solely in technique would be a very superficial thing to me.");
            quotList.add("One marked feature of the people, both high and low, is a love for flowers.");
            quotList.add("I don't feel old. I don't feel anything till noon. That's when it's time for my nap.");
        }
        public void addnewQuotetoList(String newQuot){
            quotList.add(newQuot);
        }
        public void quotoftheDay(){
            System.out.println(quotList.get(randomNumber));
        }
        public void showRandomNumber(){
            System.out.println(randomNumber);
        }

}
