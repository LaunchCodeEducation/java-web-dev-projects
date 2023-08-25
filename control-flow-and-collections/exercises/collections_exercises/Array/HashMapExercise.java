package collections_exercises.Array;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExercise {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer studentID;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("ID: ");
            studentID = input.nextInt();

            if (studentID>0) {
                System.out.print("Student Name: ");
                String studentName = input.nextLine();
                students.put(studentID, studentName);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while (studentID>0);

        // Print class roster
        System.out.println("\nClass roster:");
    }
}
