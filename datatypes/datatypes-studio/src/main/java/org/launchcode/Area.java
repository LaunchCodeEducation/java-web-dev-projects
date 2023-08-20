package org.launchcode;
import studios.areaofacircle.Circle;

import java.util.Scanner;


public class Area {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);

        System.out.println(radius);
        System.out.println("The area of a circle of a radius " + radius + "is: " + area);
    }
}
