package main.java.org.launchcode;

import java.util.Scanner;

public class areaOfACircle {
    public static void main(String[] args) {
        double radius;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle: ");
        if (input.nextDouble() < 0 ||  input.hasNextDouble() == false || input.next() == ""){
            System.out.println("Error--wrong type of input.");
        } else {
            radius = input.nextDouble();
            input.close();
            double area = areaReturn.getArea(radius);
            System.out.println(area);
        }
    }
}
