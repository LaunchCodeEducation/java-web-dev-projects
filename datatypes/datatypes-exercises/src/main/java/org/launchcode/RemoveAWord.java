package org.launchcode;

import java.util.Scanner;

public class RemoveAWord {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word to remove from the sentence: " + firstSentence);
        String word = input.next();
        input.close();
        if (firstSentence.contains(word)) {
            int index = firstSentence.indexOf(word);
            int length = word.length();
            System.out.println("Your word first appears at index " + index + ". Your term is " + length + " characters long.");
            String modifiedSentence = firstSentence.replace(word, "");
            System.out.println(modifiedSentence);
        } else {
            System.out.println("The word " + word + " is NOT found in the sentence.");
        }
    }
}
