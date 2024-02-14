package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter $$ if you want a file or enter a string to count: ");


        String input = scanner.nextLine();
        scanner.close();

        char[] charactersInString = new char[0];
        if (input == "$$") {
            System.out.println("Filepath");
            //     Scanner scans = new Scanner(filePath);
        } else {
            input = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                    "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero." +
                    " Once you've done that, it's pretty straightforward from there.";

            String myString = input;
            charactersInString = myString.toUpperCase().toCharArray();
        }

        HashMap<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < charactersInString.length; i++) {
            chars.put(charactersInString[i], chars.getOrDefault(charactersInString[i], 0) + 1);
        }

        for (Map.Entry<Character, Integer> letter : chars.entrySet()) {
            System.out.println(letter.getKey() + " :" + letter.getValue());
        }

    }
}