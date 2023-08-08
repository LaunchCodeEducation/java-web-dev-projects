package org.launchcode;
import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle:");
        length = input.nextDouble();
        System.out.println("Please enter the width of the rectangle:");
        width = input.nextDouble();
        input.close();
        area = width * length;
        System.out.println("The area of the rectangle is 0" + area);

    }
}
