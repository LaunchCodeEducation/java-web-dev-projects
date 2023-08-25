package org.launchcode;

import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice " +
                "‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter word to search in first sentence of Alice");
        String searchTerm = input.next();
        if (firstSentence.toUpperCase().contains(searchTerm.toUpperCase())) {
            System.out.println(searchTerm + " is found in the first sentence of Alice.");
        } else {
            System.out.println(searchTerm + " is not found in the first sentence of Alice.");
        }
    }
}
