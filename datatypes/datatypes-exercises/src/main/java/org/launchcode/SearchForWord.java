package org.launchcode;

import java.util.Scanner;

public class SearchForWord {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?".toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word to search for: ");
        String word = input.next().toLowerCase();
        input.close();
        if (sentence.contains(word)) {
            System.out.println("true - The word " + word + " is found in the sentence.");
        } else {
            System.out.println("false - The word " + word + " is NOT found in the sentence.");
        }
    }
}
