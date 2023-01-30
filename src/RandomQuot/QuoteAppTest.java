package RandomQuot;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class QuoteAppTest {
    public static void main(String[] args) {
        System.out.println("Your Quote of the day!");
        QuotClass quot = new QuotClass();
        quot.addQuotetoList();
        quot.quotoftheDay();

    }


}
