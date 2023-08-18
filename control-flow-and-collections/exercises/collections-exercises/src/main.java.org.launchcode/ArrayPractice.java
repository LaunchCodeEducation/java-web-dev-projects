package main.java.org.launchcode;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] values = {1, 1, 2, 3, 5, 8};
        int i;
        for (i = 0; i < values.length; i++) {
            if (values[i] % 2 != 0) {
                System.out.println(values[i]);
            }
        }
    }
}
