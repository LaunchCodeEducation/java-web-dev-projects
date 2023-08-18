package main.java.org.launchcode;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFiveLetter {

    public static void fiveLetter(ArrayList<String> arr) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a number");
        Double inputNumber = input.nextDouble();
        for (String str: arr) {
            if (str.length() == inputNumber) {
                System.out.println(str);
            }
        }
    }
}
