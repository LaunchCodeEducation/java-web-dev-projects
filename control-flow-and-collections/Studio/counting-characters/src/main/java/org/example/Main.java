package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
      String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = hiddenFigures.toCharArray();
        //System.out.println(charactersInString);
//     for (char i : charactersInString) {
//         System.out.println(i);
//        }


     HashMap <Character, Integer> charCount = new HashMap<>();

     for (char i : charactersInString) {
         if (!charCount.containsKey(i)) {
           charCount.put(i, 1);
         } else if (charCount.containsKey(i)) {
             for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                 if (entry.getKey().equals(i)) {
                     entry.setValue(entry.getValue() + 1); // Modify the value
                 }
             }
         }
     }
       // System.out.println(charCount);

        Set<Character> keys = charCount.keySet();
        //System.out.println(keys);

        for (Map.Entry<Character, Integer> count : charCount.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }
        System.out.println(charCount);

//     for (char i : charactersInString) {
//         charCount.put(i, 1);
//     }
        //System.out.println(charCount);

     Character[] charType;
     Integer charSum;



    }
}