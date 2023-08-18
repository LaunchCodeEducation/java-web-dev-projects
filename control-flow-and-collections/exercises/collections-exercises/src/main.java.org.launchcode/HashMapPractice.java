package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and ids
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                students.put(newID, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }
        } while (!newStudent.equals("")) ;
            input.close();

            // Print class roster
            System.out.println("\nClass roster:");
            for (Map.Entry<Integer, String> student : students.entrySet()) {
                System.out.println(student.getValue() + "'s ID: " + student.getKey());
            }

        System.out.println("Number of students in roster: " + students.size());
            }

        }


