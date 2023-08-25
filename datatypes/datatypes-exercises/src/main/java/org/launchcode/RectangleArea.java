package org.launchcode;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter length of rectangle");
        length= input.nextDouble();
        System.out.println("Please enter width of rectangle");
        width = input.nextDouble();
        input.close();

        area = length * width;
        System.out.println("Area: " + area);

    }

}
