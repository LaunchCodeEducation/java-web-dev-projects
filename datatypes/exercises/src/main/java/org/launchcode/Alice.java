package org.launchcode;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String rawString = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: once or twice she had " +
                "peeped into the book her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String firstSentence = rawString.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String to search for:");
        String searchTerm = input.nextLine().toLowerCase();

        // first task
        Boolean result = firstSentence.contains(searchTerm);
        System.out.println("The first sentence contains your search term: " + result);

        // next task
        Integer index = firstSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstSentence.replace(searchTerm, "");
        System.out.println(modifiedSentence);
    }
}


