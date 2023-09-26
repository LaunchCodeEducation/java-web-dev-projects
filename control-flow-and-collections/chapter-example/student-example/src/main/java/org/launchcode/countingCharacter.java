package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countingCharacter {
    public static void main(String[] args) {
        //String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input =new Scanner(System.in);
        System.out.println("enter the quote");
        String quote =input.nextLine();
        char[] charactersInString = quote.toLowerCase().toCharArray();
        HashMap<Character,Integer> countingCharacter = new HashMap<>();
        for (char letter : charactersInString) {
            int count = countingCharacter.containsKey(letter) ? countingCharacter.get(letter) : 0;
            countingCharacter.put(letter, count + 1);

        }
        for (Map.Entry<Character,Integer> character: countingCharacter.entrySet()){
            System.out.println(character.getKey() + ":" + character.getValue());
        }


    }


}
