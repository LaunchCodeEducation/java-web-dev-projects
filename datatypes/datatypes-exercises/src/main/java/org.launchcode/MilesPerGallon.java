package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles driven:");
        int miles = input.nextInt();

        System.out.println("Enter gallons of gas consumed:");
        int gallons = input.nextInt();

        System.out.println("Miles-per-Gallon: " + (miles / gallons));
    }
}
