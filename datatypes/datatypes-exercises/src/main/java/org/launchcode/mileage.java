package org.launchcode;
import java.util.Scanner;
public class mileage {
    public static void main(String[] args){
        double miles;
        double gallon;
        double mpg;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("miles driven:");
        miles=input.nextDouble();
        System.out.println("Gallons consumed:");
        gallon=input.nextDouble();
        input.close();
        mpg=miles/gallon;
        System.out.println("mileage:"+ mpg);
    }}
