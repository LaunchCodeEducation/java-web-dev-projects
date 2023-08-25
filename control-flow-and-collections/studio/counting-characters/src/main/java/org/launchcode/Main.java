package org.launchcode;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static org.launchcode.Bonus.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.".toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a quote to count the characters: ");
        String str = input.nextLine();
        str = str.toLowerCase();
        str = str.replaceAll("[^A-Za-z0-9]", "");
        characterCount(str);
        characterCount(BonusMission().toLowerCase());
        input.close();
    }

    public static void characterCount(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {

            if(charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
