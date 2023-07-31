package org.launchcode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double fahrenheit;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
        input.close();

        Temperature currentTemp = new Temperature();
        currentTemp.setFahrenheit(fahrenheit);
    }
}