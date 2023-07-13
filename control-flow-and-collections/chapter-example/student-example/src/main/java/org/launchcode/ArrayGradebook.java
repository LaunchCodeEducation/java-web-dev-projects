package org.launchcode;

import java.util.Scanner;

public class ArrayGradebook {
    public static void main(String[] args) {
        // Allow for at most 30 students
        int maxStudents = 30;

        String[] students = new String[maxStudents];
        double[] grades = new double[maxStudents];
        Scanner input = new Scanner(System.in);

        String newStudent;
        int numStudents = 0;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names
        do {
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                students[numStudents] = newStudent;
                numStudents++;
            }

        } while(!newStudent.equals(""));

        // Get student grades
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Grade for " + students[i] + ": ");
            double grade = input.nextDouble();
            grades[i] = grade;
        }

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (int i = 0; i < numStudents; i++) {
            System.out.println(students[i] + " (" + grades[i] + ")");
            sum += grades[i];
        }

        double avg = sum / numStudents;
        System.out.println("Average grade: " + avg);
    }
}
