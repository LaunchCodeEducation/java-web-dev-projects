package main.java.org.launchcode;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me the length of a rectangle: ");
        int length = input.nextInt();
        System.out.println("Give me the width of a rectangle: ");
        int width = input.nextInt();
        int area = area(length, width);
        System.out.println("The area of a rectangle is: " + area);
    }
    public static int area(int length, int width) {
        return length * width;
    }
}
