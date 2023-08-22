package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of your circle: ");
        double userRadius = input.nextDouble();
        System.out.println("The area of this circle is "+ Circle.getArea(userRadius));
        input.close();
    }
    public static double calculate(double radius){
        return (radius*radius*3.14);
    }
}
