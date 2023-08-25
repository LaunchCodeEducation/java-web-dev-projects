package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice2 {
    public static void fiveLetterFinder (ArrayList<String> arr) {
        int designatedSearchLength;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter search length");
        designatedSearchLength = input.nextInt();
        input.close();

        for (String word : arr) {
            if (word.length() == designatedSearchLength) {
                System.out.println(word);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        String poem = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] poemSplit = poem.split(" ");

        ArrayList<String> poemList = new ArrayList<String>(
                Arrays.asList(poemSplit));


        fiveLetterFinder(poemList);
    }
}
