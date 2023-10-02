package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        //Divide(5, 0);
        System.out.println(CheckFileExtension("program.java"));




        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y)
    {
        if(y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by zero!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        int result = x/y;
    }

    public static int CheckFileExtension(String fileName)
    {// Write code here!
        String extension = fileName.substring(fileName.length()-5, fileName.length());
        int score;

        if (fileName.isBlank() || fileName == null) {
           score = -1;
        } else if (extension.equals(".java")) {
            score = 1;
        } else {
            score = 0;
        }

        return score;
    }
}