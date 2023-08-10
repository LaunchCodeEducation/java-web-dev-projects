package main.java.org.launchcode;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String quote = "Alice was beginning to get very tired of sitting by her sister on the " +
        "bank, and of having nothing to do: once or twice she had peeped into the book her " +
                "sister was reading, but it had no pictures or conversations in it, ‘and what is the " +
                "use of a book,’ thought Alice ‘without pictures or conversation?";

        System.out.println(quote);
        System.out.println("What term would you like to search for?");

        String answer = input.nextLine();
        System.out.println(quote.toLowerCase().contains(answer));

        Integer index = quote.indexOf(answer);
        Integer length = answer.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = quote.replace(answer, "");
        System.out.println(modifiedSentence);
    }

}

//    String s1 = "alpha beta gama delta sigma";
//    57 String[] words = s1.split(" ", 3);