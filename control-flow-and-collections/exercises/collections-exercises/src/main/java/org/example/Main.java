package org.example;

import jdk.jshell.Snippet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] intArr = {1, 1, 2, 3, 5, 8};

        for(int i : intArr){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString((words)));

        String[] words2 = sentence.split("\\.");
        System.out.println(Arrays.toString((words2)));

        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i = 0; i < 10; ++i){
            arr1.add(i);
        }
        System.out.println(sumEven(arr1));

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("super");
        arr2.add("cat");
        arr2.add("giraffe");
        arr2.add("Hippopotomonstrosesquippedaliophobia");
        longWords(arr2);

        ArrayList<String> strList = new ArrayList<String>(
                Arrays.asList(words));
        longWords(strList);
    }

    public static int sumEven(ArrayList<Integer> arr){
        int total = 0;

        for(int i : arr){
            if(i % 2 == 0){
                total += i;
            }
        }

        return total;
    }

    public static void longWords(ArrayList<String> arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word length: ");
        int limit = input.nextInt();
        for(String i : arr){
            if(i.length() >= limit){
                System.out.println(i);
            }
        }
    }
}