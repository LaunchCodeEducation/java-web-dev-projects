package org.launchcode;

import java.util.Scanner;


public class TempConverter {
    public static void main(String[] args) {
        double fahrenheit;
        Double celsius;
        String Megha;
   //     double input;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();
  //      fahrenheit = input;
        input.close();

        celsius = (fahrenheit - 32) * 5/9;
        Megha = celsius.toString();
        System.out.println(Megha);
        System.out.println("The temperature in Celsius is: " + celsius + "°C");
    }
}
