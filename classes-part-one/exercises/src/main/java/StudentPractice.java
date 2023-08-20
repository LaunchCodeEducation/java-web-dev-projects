package main.java;

public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student newStudent = new Student();
        newStudent.setNumberOfCredits(1);
        newStudent.setGpa(4.0);

        System.out.println(newStudent.getGpa());
    }
}
