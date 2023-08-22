package main.java.org.launchcode; //changed from org.launchcode to match after i right clicked on src to designate it as source/main so that i could run these java files

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner input; // Comments do not have to start at the beginning of a line.

        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();  //initializes the fahrenheit variable and makes sure input data matches declared data type.
        input.close();

        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
