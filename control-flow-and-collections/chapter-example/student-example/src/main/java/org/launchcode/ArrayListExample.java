package org.launchcode;
import java.util.ArrayList;

public class ArrayListExample {

    public static int sumEvenNumbers(ArrayList<Integer> numbers){
        int sum = 0;
        for(int num: numbers){
            if(num % 2 == 0){
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(12);
        numbers.add(18);
        numbers.add(2);
        numbers.add(8);
        numbers.add(3);
        numbers.add(9);
        numbers.add(11);
        numbers.add(7);

        int ArrayTotal = sumEvenNumbers(numbers);
        System.out.println("Sum of Even numbers in ArrayList is " + ArrayTotal + ".");
    }
}