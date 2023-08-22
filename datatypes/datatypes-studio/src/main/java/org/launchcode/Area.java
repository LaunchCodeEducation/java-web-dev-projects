package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        //var radius = 0.0
        Scanner input = new Scanner(System.in);
        // initializing out here prevents the code from rendering at all double userRadius = input.nextDouble();
        System.out.println("Please enter the radius of your circle: ");
        double userRadius = input.nextDouble();
        //while(userRadius < 0.0) {

            //System.out.println("You've entered a negative value in error. The area of a circle with "+input+" as a positive value is "+Circle.getArea(userRadius));

            //radius = new Sca
//            input = new Scanner (System.in);
//            System.out.println("Invalid input. Please enter a positive number: ");
//        };
           if(userRadius< 0.0) {
            //double userRadius = input.nextDouble();
            System.out.println("You've entered a negative value in error. The area of a circle with "+userRadius+" as a positive value is "+Circle.getArea(userRadius));
        } else if ((input.hasNextInt() || input.hasNextFloat() || input.hasNextDouble())) {
            //double userRadius = input.nextDouble();
            System.out.println("The area of this circle is " + Circle.getArea(userRadius));
        } else {
              System.out.println("Invalid input, please try again later!");
          }
            input.close();
    }
//    public static double calculate(double radius){
//        return (radius*radius*3.14);
//    }
    //coded this before i got to part 2

    }

