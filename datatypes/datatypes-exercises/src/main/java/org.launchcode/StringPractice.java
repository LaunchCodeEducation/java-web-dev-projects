package org.launchcode;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = "Alice was beginning to get very tired of sitting by her sister on " +
                "the bank, and of having nothing to do: once or twice she had peeped into the book " +
                "her sister was reading, but it had no pictures or conversations in it, ‘and what " +
                "is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        String textExcerpt = text.toLowerCase();

        System.out.println("Enter term to search:");
        String word = input.nextLine();
        boolean containInText = textExcerpt.contains(word);
        int ind = textExcerpt.indexOf(word);
        int length = word.length();
        String revisedText = textExcerpt.replace(word, "");

        System.out.println(containInText);
        System.out.println("Found at index " + ind);
        System.out.println("Word has a length of " + length);
        System.out.println("Text with word removed");
        System.out.println(revisedText);
    }
}
