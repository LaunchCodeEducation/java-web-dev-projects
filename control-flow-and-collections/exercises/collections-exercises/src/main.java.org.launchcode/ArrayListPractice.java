package main.java.org.launchcode;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListExample = new ArrayList<>();
        arrayListExample.add(5);
        arrayListExample.add(7);
        arrayListExample.add(4);
        arrayListExample.add(2);
        arrayListExample.add(4);
        arrayListExample.add(1);
        arrayListExample.add(3);
        arrayListExample.add(8);
        arrayListExample.add(3);
        arrayListExample.add(5);

        System.out.println(ArrayListSumMethod.getSum(arrayListExample));

        ArrayList<String> fruit = new ArrayList<> ();
        fruit.add("pear");
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("cherry");
        fruit.add("peach");
        ArrayListFiveLetter.fiveLetter(fruit);

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] newArray = sentence.split(" ");
        ArrayList<String> strList = new ArrayList<String> (
                Arrays.asList(newArray));

        for (String s: strList) {
            System.out.println(s);
        }
    }
}
