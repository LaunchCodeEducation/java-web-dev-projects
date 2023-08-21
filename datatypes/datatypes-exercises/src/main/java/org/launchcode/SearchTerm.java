package org.launchcode;

import java.util.Scanner;

public class SearchTerm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence = "Alice was beginning to get very tired...";
        System.out.println("Enter a term to search for:");
        String searchTerm = input.nextLine();

        boolean found = sentence.toLowerCase().contains(searchTerm.toLowerCase());
        System.out.println("Search term found: " + found);
    }
}

