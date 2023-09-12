package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius;
        double area;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter a radius.");
        radius = input.nextDouble();
        input.close();
        if (radius > 0) {
            area = Circle.getArea(radius);
            System.out.println("The area of the circle with radius " + radius + " is " + area);
            } else {
            System.out.println("Error");

        }
    }
}
