package org.launchcode;

import java.util.Scanner;

public class ArrayGradebook {

//    Like an Array, we must let the compiler know what kind of objects our ArrayList is going to contain. In the case of students, the ArrayList will contain values of type String (representing the names of the students), so we use the ArrayList<String> syntax to inform the compiler that we intend to fill our list with Strings. Similarly, grades will hold exclusively values of type Double and is declared to be of type ArrayList<Double>.
    public static void main(String[] args) {
        //In lines 13 and 14, we also initialize each list by creating a new, empty list. Note that when we call the ArrayList constructor, as in new ArrayList<>(), we don’t need to specify type (it’s implicit in the left-hand side of the assignment).
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
