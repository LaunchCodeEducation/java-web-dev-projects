package org.launchcode;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle: ");
        int length = input.nextInt();

        System.out.println("What is the width of the rectangle: ");
        int width = input.nextInt();

        int area = length * width;

        System.out.println("Length: " + length + "\nWdith: " + width + "\nArea: " + area );
        input.close();
    }
}
