package org.launchcode;

import java.util.Scanner;

public class Circle {
    public static Double getArea(Double radius) {

        return 3.14 * radius * radius;
    }
    public static boolean validateInput(String radius) {
        Double verifyRadius;
        try {
            verifyRadius = Double.parseDouble(radius);
            if (verifyRadius > 0 ) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }

    }
}
