package org.launchcode;
import java.util.Scanner;

public class Area {
public static void main (String[]args){
    double A;
    double r;
   // double pi=3.14;
    Scanner input;
    input = new Scanner(System.in);
    System.out.println("Enter the radius: ");
    r= input.nextDouble();
    input.close();
    A = Circle.getArea(r);
     System.out.println("area of circle:"+ A);

}


}
