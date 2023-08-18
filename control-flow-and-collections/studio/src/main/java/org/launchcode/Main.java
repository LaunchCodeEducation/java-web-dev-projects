package src.main.java.org.launchcode;
import java.util.Map;
import java.util.HashMap;

// I want to loop through the new array, which features all the characters, and count how many times each character comes up. so my new array features all the characters and i can loop through that to compare each character the
public class Main {
    public static void main(String[] args) {
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = str.toCharArray();
        HashMap<Character, Integer> output = new HashMap<>();
        for (int i = 0; i <charactersInString.length; i++) {
            char input = charactersInString[i];
            int sum = 0;
            for (int j= 0; j < charactersInString.length; j++) {
                if (charactersInString[j] == input) {
                    sum++;
                    output.put(charactersInString[j], sum);
                }
            }
        }

        for (Map.Entry<Character, Integer> character : output.entrySet()) {
            System.out.println(character.getKey() + ":" + character.getValue());
        }
    }
}
