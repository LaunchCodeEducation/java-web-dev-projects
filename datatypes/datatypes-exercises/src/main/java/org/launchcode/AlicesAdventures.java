package org.launchcode;

import java.util.Scanner;
public class AlicesAdventures {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        String firstLine = "Alice was beginning to get very tired of sitting by her sister on the " +
                "bank, and of having nothing to do: once or twice she had peeped into the book " +
                "her sister was reading, but it had no pictures or conversations in it, ‘and " +
                "what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        System.out.println("What term would you like to find: ");
        String searchTerm = input.next().toLowerCase();
        String lowerCaseFirstLine = firstLine.toLowerCase();

        System.out.println(lowerCaseFirstLine.contains(searchTerm));


        if (lowerCaseFirstLine.contains(searchTerm)){
            Integer startOfSearchTerm = lowerCaseFirstLine.indexOf(searchTerm);
            Integer lengthOfSearchTerm = searchTerm.length();
           System.out.println(startOfSearchTerm);
           System.out.println(lengthOfSearchTerm);
            String newFirstLine = firstLine.replace(searchTerm + " ", "");
//           String newFirstLine = lowerCaseFirstLine.substring(0, lowerCaseFirstLine.indexOf(searchTerm)) + lowerCaseFirstLine.substring(lowerCaseFirstLine.indexOf(searchTerm) + searchTerm.length() + 1);
           System.out.println(newFirstLine);
        }


        input.close();
    }
}
