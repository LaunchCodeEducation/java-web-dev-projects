package org.launchcode;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {

        String hiddenFigures = "If the product of two terms is zero then common sense says at least " +
                "one of the two terms has to be zero to start with. So if you move all the " +
                "terms over to one side, you can put the quadratics into a form that can " +
                "be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = hiddenFigures.toCharArray();
        HashMap<Character, Integer> character = new HashMap<>();

        for (int i = 0; i < charactersInString.length; i++){
            Integer intCounter = 0;
            char charPlaceholder = charactersInString[i];
            character.put(charPlaceholder, intCounter);
            for(char c : charactersInString){
                if(charPlaceholder == c){
                    character.put(charPlaceholder, character.get(charPlaceholder)+1);

                }
            }
        }




        for (Map.Entry<Character, Integer> c : character.entrySet()) {
            System.out.println(c.getKey() + ": " + c.getValue());
        }
    }
}