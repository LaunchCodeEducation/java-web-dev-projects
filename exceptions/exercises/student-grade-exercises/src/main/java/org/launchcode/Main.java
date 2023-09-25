package src.main.java.org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(5, 0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y)
    {
        // Write code here!
        if(y == 0) {
            try {
                throw new ArithmeticException("cannot divide by zero!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        int result = x/y;
    }

//    public static int CheckFileExtension(String fileName)
//    {
//        // Write code here!
//    }
}