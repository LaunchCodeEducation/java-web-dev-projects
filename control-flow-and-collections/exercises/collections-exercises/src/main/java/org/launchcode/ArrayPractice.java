package org.launchcode;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        // Print out each number in the array using a for-each loop.
        for (int integer: integerArray) {
            System.out.println(integer);
        }

        // Print out each even number in the array using a for loop (for-each works as well).
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i]%2 == 0){
                System.out.println(integerArray[i]);
            }
        }

        // Split 'phrase' into an array of words, then print the array.
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        // Split 'phrase' into an array of sentences, then print the array.
        // "." does not work as-is for the deliminator. "\\." escapes it's special meaning.
        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
