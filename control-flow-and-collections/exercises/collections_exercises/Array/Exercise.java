package collections_exercises.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        int integerArray[] = {1, 1, 2, 3, 5, 8};
//        for (int i = 0; i < 6; i++) {
//            if (integerArray[i])
//        }
        System.out.println("Print all numbers:");
        for (int i : integerArray) {

            System.out.println(i);
        }
        System.out.println("\nPrint odd numbers only:");
        for (int i : integerArray) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("\nPrint sentence with space as delimiter: ");
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitSentence = sentence.split(" ");
        System.out.println(Arrays.toString(splitSentence));
        System.out.println("\n Print sentence with sentence as delimiter: ");
        String[] splitSentence2 = sentence.split("\\.");
        System.out.println(Arrays.toString(splitSentence2));


        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 1; i < 13; i++) {
            numList.add(i);
        }

        System.out.println(sumEven(numList));

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("Write");
        wordList.add("a");
        wordList.add("static");
        wordList.add("method");
        wordList.add("to");
        wordList.add("print");

        System.out.println(wordList);



        wordPicker(wordList);




        //System.out.println(wordPicker(otherSentence));

    }

    public static int sumEven(ArrayList<Integer> numList) {
        //System.out.println(numList);
        int sumEvens = 0;
        for (int index : numList) {
            //Integer sumEvens = 0;
            if (index % 2 == 0) {
                sumEvens += index;
            }
        }
        return sumEvens;

    }


   // public class WordPrinter {
        public static void wordPicker(ArrayList<String> words) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a word length: ");
            int numChars = input.nextInt();
            for (String word : words) {
                if (word.length() == numChars) {
                    System.out.println(word);
                }
            }
        }



//    public static String[] wordPicker(ArrayList otherSentence) {
//        String [] wordsOfOtherSentence = otherSentence.split(" ");
//        return wordsOfOtherSentence;
//        for (int i = 0; i < wordsOfOtherSentence.size; i++) {
//            //for (int i : wordsOfOtherSentence)
//            if (wordsOfOtherSentence[i].size) {
////        }
//            }
//        }
//    }
}

