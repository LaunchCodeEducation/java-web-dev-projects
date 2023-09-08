package org.launchcode;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String title;
    private String instructor;
    private int credits;

    public Course (String title, int credits, String instructor) {
        this.title = title;
        this.credits = credits;
        this.instructor = instructor;
    }

    public String toString(){
        return  title + " Credits: " + credits + " Taught by: " + instructor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(title, course.title) && Objects.equals(instructor, course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, instructor);
    }


}
