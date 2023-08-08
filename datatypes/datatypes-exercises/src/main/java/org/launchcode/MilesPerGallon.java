package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double distance;
        double gallons;
        double mpg;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Please enter the distance you've traveled:");
        distance = input.nextDouble();
        System.out.println("Please enter the amount of gas you've used:");
        gallons = input.nextDouble();
        input.close();
        mpg = distance/gallons;
        System.out.println("Your mpg is " + mpg + " miles/gallon");
    }
}
