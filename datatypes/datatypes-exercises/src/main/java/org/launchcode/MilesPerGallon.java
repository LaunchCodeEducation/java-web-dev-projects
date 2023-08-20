package org.launchcode;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        Double miles = input.nextDouble();

        System.out.println("How many gallons of gas did you use: ");
        Double gallons = input.nextDouble();

        Double milesPerGallon = miles / gallons;

        System.out.println("Miles per Gallon: " + milesPerGallon);
        input.close();
    }
}
