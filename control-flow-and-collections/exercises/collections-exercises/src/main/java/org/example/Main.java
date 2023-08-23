package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Print All Numbers:");
        Arrays.ListNumbers();
        System.out.println("Print Odd Numbers:");
        Arrays.OddNumbers();
        System.out.println("String Array:");
        Arrays.StringArray();
        System.out.println("Split Sentences:");
        Arrays.SplitSentences();
        System.out.println("ArrayList - Sum Even Numbers:");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        System.out.println(ArrayLists.SumEvenNumbers(arr));
        System.out.println("ArrayList - Print 5 words from list:");
        System.out.println(ArrayLists.PrintFive());
        System.out.println("ArrayList - Choose length to print from list:");
        System.out.println(ArrayLists.PickLengthPrint());
        System.out.println("ArrayList - Split string into ArrayList:");
        ArrayLists.ConvertString();
        System.out.println("HashMap - Class Roster:");
        HashMapGradebook.Gradebook();
    }
}