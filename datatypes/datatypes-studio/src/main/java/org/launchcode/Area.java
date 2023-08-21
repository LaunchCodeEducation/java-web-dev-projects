package org.launchcode;
import studios.areaofacircle.Circle;

import java.util.Scanner;


public class Area {
    public static void main(String[] arg) {
        Double radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        try {
            radius = input.nextDouble();
            while (radius < 0) {
                System.out.println("Invalid input: Please enter a positive radius: ");
                radius = input.nextDouble();
            }

            Double area = Circle.getArea(radius);
            System.out.println(radius);
            System.out.println("The area of a circle of a radius " + radius + " is: " + area);

        } catch (Exception e) {
            System.out.println("Enter a numbered radius: Please start over");
        }


        input.close();
    }
}
