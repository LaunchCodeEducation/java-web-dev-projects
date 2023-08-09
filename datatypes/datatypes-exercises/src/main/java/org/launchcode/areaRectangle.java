package org.launchcode;
import java.util.Scanner;
public class areaRectangle {
    public static void main(String[] args) {
        double width;
        double length;
        double area;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Length of rectangle:");
        length = input.nextDouble();
        //System.out.println("Length of rectangle:" + length);
        System.out.println("Width of rectangle:");
        width = input.nextDouble();
        //System.out.println("Width of rectangle:" + width);
        input.close();
        area = (length * width);
        System.out.println("Area of rectangle:"+ area);

    }


}

