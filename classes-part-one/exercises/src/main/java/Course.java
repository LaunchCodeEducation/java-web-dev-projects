package main.java;

import java.util.ArrayList;

public class Course {
    private String subject;
    private Teacher instructor;
    private ArrayList<Student> students;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
