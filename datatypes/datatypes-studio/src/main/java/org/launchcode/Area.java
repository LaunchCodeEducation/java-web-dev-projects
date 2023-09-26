package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        double radius =input.nextFloat();
       double areaCircle = Circle.getArea(radius);
        System.out.println("Area of a circle " +areaCircle);
        input.close();
    }
}
