package org.launchcode;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Say Echo");
        String echo = input.nextLine();
        input.close();
        System.out.println(echo + " ECHO!!");
    }
}
