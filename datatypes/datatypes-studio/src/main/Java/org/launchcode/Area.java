package org.launchcode;

import studios.areaofacircle.Circle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Double radius;
        double pi = 3.14;
        Double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();

        if (radius.isNaN()) {
            System.out.println("Invalid Input");
            input.close();
        }

        if (radius < 0) {
            System.out.println("Enter a radius: ");
            radius = input.nextDouble();
        }
        input.close();

      //  area = (pi) * radius * radius;
        area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
