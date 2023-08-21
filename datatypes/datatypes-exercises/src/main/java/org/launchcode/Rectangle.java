package org.launchcode;

import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        Integer length =input.nextInt();
        System.out.println("Enter the width of the rectangle");
        Integer width =input.nextInt();
        Integer aoR = length * width;
        System.out.println("Area of the Rectagle is" + aoR + "cm");
    }
}
