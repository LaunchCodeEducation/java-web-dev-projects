package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare and initialize the integer list and word list:
        ArrayList<Integer> someIntegers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 33, 42, 101, 1138));
        String phrase = "I would not could not in a box I would not could not with a fox I will not eat them in a house I will not eat them with a mouse";
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(phrase.split(" ")));

        // Call the sumEven method to calculate the sum of the even numbers in a list:
        System.out.println(sumEven(someIntegers));

        // Prompt the user for a word length:
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        // Call the method to print out list words of the chosen length:
        printFiveLetterWords(wordList, numChars);
    }

    public static int sumEven(ArrayList<Integer> arr){
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void printFiveLetterWords(ArrayList<String> arr, int length){
        for (String word : arr) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}