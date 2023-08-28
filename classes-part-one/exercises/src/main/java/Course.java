import java.util.HashMap;

public class Course {

    private String courseName;

    private int courseCredits;

    private HashMap <String, String> grades = new HashMap<>();

    public Course(String courseName, int courseCredits, HashMap grades) {
        this.courseName = courseName;
        this.courseCredits = courseCredits;
        this.grades = grades;
    }

    //getters and setters below

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String aCourseName) {
        courseName = aCourseName;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(int aCourseCredits) {
        courseCredits = aCourseCredits;
    }

    public HashMap getGrades(){
        return grades;
    }
    public void setGrade(String aStudentName, String aGrade) {
        grades.put(aStudentName, aGrade);
    }
}
