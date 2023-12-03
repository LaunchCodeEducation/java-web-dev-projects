package org.launchcode;

import studios.areaofacircle.Circle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Double radius = null;
        double pi = 3.14;
        Double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
      //  input.next();
        radius = input.nextDouble();
     /*
        while (input.hasNext()) {

            if (input.hasNextDouble()) {
         //       radius = input.nextDouble();
                if (input.nextDouble() < 0) {
                    System.out.println("Invalid Input try again");
                    input.next();
                } else {

                    radius = input.nextDouble();
                    //      input.next();
                          input.close();
                }
            }
                else {
                    System.out.println("Invalid Input try again");
                    input.next();
//                    input.close();
                }
            }

            input.close();


      //  area = (pi) * radius * radius;

      */
        area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
