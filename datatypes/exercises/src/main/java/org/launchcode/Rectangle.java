package org.launchcode;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your rectangle's length?");
        Double length = input.nextDouble();

        System.out.println("What is your rectangle's width?");
        Double width = input.nextDouble();

        Double area = length * width;
        System.out.println("Your rectangle has an area of " + area + " units squared.");
    }
}


