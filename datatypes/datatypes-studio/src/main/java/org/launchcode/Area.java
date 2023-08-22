package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        String radius = input.next();
        while (!Circle.validateInput(radius)) {
            System.out.println("Please enter valid number:");
            radius = input.next();
        }
//
        input.close();
        double verifyRadius = Double.parseDouble(radius);
        double area = Circle.getArea(verifyRadius);
        System.out.println("The area of a circle of radius " + verifyRadius
                + " is: " + area + ".");
    }
}