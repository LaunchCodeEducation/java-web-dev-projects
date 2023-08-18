package main.java.org.launchcode;
import java.util.ArrayList;

public class ArrayListSumMethod {
    public static int getSum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int integer: arr) {
            if (integer % 2 == 0) {
                sum += integer;
            }
        }
        return sum;
    }
}
