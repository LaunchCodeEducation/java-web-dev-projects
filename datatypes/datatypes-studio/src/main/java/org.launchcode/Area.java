package org.launchcode;

import org.launchcode.Circle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        boolean printed = false;
        do{
            try{
                System.out.println("Enter a radius: ");
                Scanner input = new Scanner(System.in);
                double radius = input.nextDouble();
                if(radius > 0){
                    double area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is: " + area + ".");
                    printed = true;
                }
                else{
                    System.out.println("You entered an invalid value. Try again");
                }
            } catch(Exception e){
                System.out.println("You entered an invalid value. Try again");
            }
        }while(!printed);
    }
}