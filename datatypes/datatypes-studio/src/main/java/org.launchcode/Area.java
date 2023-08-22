package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        boolean isDouble = input.hasNextDouble();
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();

        try {
            if (radius <= 0) {
                System.out.println("Not a valid value.");
            } else {
                Double area = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is: " + area);
            }
            input.close();
        } catch(Exception error) {
            System.out.println("Not a valid value.");
        }
    }
}
