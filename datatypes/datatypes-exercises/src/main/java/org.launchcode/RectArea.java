package org.launchcode;

import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of Rectangle:");
        int length = input.nextInt();

        System.out.println("Enter width of Rectangle:");
        int width = input.nextInt();

        System.out.println("Area of Rectangle: " + (length * width));
    }
}
