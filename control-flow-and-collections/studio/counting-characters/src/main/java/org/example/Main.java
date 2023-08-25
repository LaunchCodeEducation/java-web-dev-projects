package org.example;

import java.util.HashMap;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String sentence = "If the product of two terms is zero then common sense says at least one of " +
                "the two terms has to be zero to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side of the equation " +
                "to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some text: ");
        String userInput = input.nextLine();
        userInput = userInput.replaceAll("[^a-zA-Z]", "");

        HashMap<Character, Integer> characters = new HashMap<>();

        for(int i = 0; i < userInput.length(); i++){
            //System.out.println(sentence.charAt(i));
            if(characters.containsKey(Character.toLowerCase(userInput.charAt(i)))){
                characters.put(Character.toLowerCase(userInput.charAt(i)), characters.get(Character.toLowerCase(userInput.charAt(i))) + 1);
            }
            else{
                characters.put(Character.toLowerCase(userInput.charAt(i)), 1);
            }
        }

        for(Character key : characters.keySet()){
            System.out.println(key + ": " + characters.get(key));
        }
    }
}