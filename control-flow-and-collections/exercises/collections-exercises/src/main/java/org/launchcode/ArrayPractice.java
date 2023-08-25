package org.launchcode;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayPractice {
    public static void main(String[] args) {
//  Array Practice
//      Steps 1 and 2
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int integer : integerArray) {
            System.out.println(integer);
            int odd = integer % 2;
            if (odd == 1){
                System.out.println(integer);
            }
        }
//      Steps 3, 4, 5
        String str = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";
        String[] strArray = str.split("\\.");
        System.out.println(Arrays.toString(strArray));

//  ArrayList Practice
//          Step 1
            ArrayList<Integer> nums = new ArrayList<>();
            nums.add(1);
            nums.add(2);
            nums.add(3);
            nums.add(4);
            nums.add(5);
            nums.add(6);
            nums.add(7);
            nums.add(8);
            nums.add(9);
            nums.add(10);

            int sum = 0;
            for (int number : nums){
                if (number % 2 == 0){
                    sum += number;
                }
            }
            System.out.println(sum);
//      Step 2 and 3
            ArrayList<String> words = new ArrayList<>();
            words.add("I");
            words.add("do");
            words.add("not");
            words.add("like");
            words.add("apple");

            Scanner input = new Scanner(System.in);
//            System.out.println("Enter length of word 1 - 5: ");
//            int userChoice = input.nextInt();
//            for (String word : words){
//                if(word.length() == userChoice){
//                    System.out.println(word);
//                }
//            }
//      Step 4
//            System.out.println("Pick a number between 1 and 6");
//            int userInput = input.nextInt();
//            String[] strSplit = str.split(" ");
//
//            ArrayList<String> strList = new ArrayList<>(Arrays.asList(strSplit));
//            for (String s : strList ){
//                if(s.length() == userInput){
//                    System.out.println(s);
//                }
//            }

//  HashMap Practice
//      Step 1

        HashMap<Integer, String> classRoster = new HashMap<>();
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.put(newID, newStudent);

                input.nextLine();
            }
        } while(!newStudent.equals(""));

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + classRoster.size());

        input.close();
    }
}
// to get one of the practices to work you have to comment out the other practice to void the input.
// Not sure why at this time 8/21/2023