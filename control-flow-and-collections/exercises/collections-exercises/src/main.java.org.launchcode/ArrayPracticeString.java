package main.java.org.launchcode;
import java.util.Arrays;

public class ArrayPracticeString {
    public static void main(String[] args) {
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
                String[] newArray = sentence.split("\\.");
                System.out.println(Arrays.toString(newArray));
    }
}
