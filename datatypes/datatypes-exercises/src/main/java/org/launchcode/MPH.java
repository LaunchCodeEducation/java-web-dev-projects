package org.launchcode;

import java.util.Scanner;
public class MPH {
    public static void main(String[] args) {
        double milesDriven;
        double gallons;
        double mPH;
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles did you drive?");
        milesDriven = input.nextDouble();
        System.out.println("How many gallons did you consume?");
        gallons = input.nextDouble();
        input.close();

        mPH = milesDriven / gallons;
        System.out.println("You consumed " + mPH + " mph");
    }
}
