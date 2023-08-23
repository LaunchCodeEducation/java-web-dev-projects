package org.example;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {

    public static int SumEvenNumbers(ArrayList<Integer> arr) {
        int sum = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                sum += integer;
            }
        }
        return sum;
    }

    public static String PrintFive() {
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        arr.add("propane");
        arr.add("tanks");
        arr.add("Peggy");
        arr.add("Hank");
        arr.add("Bobby");
        arr.add("Dale");
        arr.add("cooler");
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() == 5) {
                words.add(arr.get(i));
            }
        }
        return String.valueOf(words);
    }

    public static String PickLengthPrint() {
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        arr.add("propane");
        arr.add("tanks");
        arr.add("Peggy");
        arr.add("Hank");
        arr.add("Bobby");
        arr.add("Dale");
        arr.add("cooler");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length (4-7):");
        int numChars = input.nextInt();
//        input.close(); - keep open for next program!

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() == numChars) {
                words.add(arr.get(i));
            }
        }
        return String.valueOf(words);
    }

    public static void ConvertString() {
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentenceSplit = sentence.split(" ");
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(sentenceSplit));
        System.out.println(wordList);
    }

}
