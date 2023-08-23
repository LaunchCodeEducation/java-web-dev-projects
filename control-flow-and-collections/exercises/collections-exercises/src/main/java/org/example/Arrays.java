package org.example;

public class Arrays {
    public static void ListNumbers() {
        int[] numbersArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < numbersArray.length; i++ ) {
            System.out.println(numbersArray[i]);
        }
    }

    public static void OddNumbers() {
        int[] numbersArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 != 0) {
                System.out.println(numbersArray[i]);
            }
        }
    }

    public static void StringArray() {
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentenceArray = sentence.split(" ");
        System.out.println(java.util.Arrays.toString(sentenceArray));
    }

    public static void SplitSentences() {
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitSentences = sentence.split("\\.");
        System.out.println(java.util.Arrays.toString(splitSentences ));
    }

}
