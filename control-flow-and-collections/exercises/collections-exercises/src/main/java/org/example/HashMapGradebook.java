package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapGradebook {

    public static void Gradebook() {
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your student's names (or ENTER to finish):");

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("ID #: ");
                Integer newId = input.nextInt();
                students.put(newStudent, newId);

                input.nextLine();
            }
        } while (!newStudent.equals(""));

        System.out.println("\nClass roster:");

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " (Id#: " + student.getValue() + ")");
        }

        int classSize = students.size();
        System.out.println("Class Size: " + classSize);
        input.close();
    }
}
