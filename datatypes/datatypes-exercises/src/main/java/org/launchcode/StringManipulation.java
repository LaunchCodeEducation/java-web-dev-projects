package org.launchcode;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence = "Alice was beginning to get very tired...";
        System.out.println("Enter a word to search for:");
        String word = input.nextLine();

        int index = sentence.toLowerCase().indexOf(word.toLowerCase());
        int wordLength = word.length();

        if (index != -1) {
            System.out.println("Word found at index: " + index);
            System.out.println("Word length: " + wordLength);

            // Remove the word
            String updatedSentence = sentence.substring(0, index) + sentence.substring(index + wordLength);
            System.out.println("Updated sentence: " + updatedSentence);
        } else {
            System.out.println("Word not found in the sentence.");
        }
    }
}
