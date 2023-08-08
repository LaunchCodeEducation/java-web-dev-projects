package org.launchcode;
import java.util.Scanner;

public class AliceInWonderland {
    public static void main(String[] args) {
        String aliceQuote = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped into " +
                "the book her sister was reading, but it had no pictures or conversations in it," +
                " ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?";
        String inputWord;
        String aliceQuoteLower;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please enter the word you would like to search: ");
        inputWord = input.next().toLowerCase();
        aliceQuoteLower = aliceQuote.toLowerCase();
        input.close();
        System.out.println("length of the word: " + inputWord.length() + " index of word: " + aliceQuoteLower.indexOf(inputWord));
        String replacedSentence;
        replacedSentence = aliceQuoteLower.replace(inputWord, "");
        System.out.println(replacedSentence);
    }
}
