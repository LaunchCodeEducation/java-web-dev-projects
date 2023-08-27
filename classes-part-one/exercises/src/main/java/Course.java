import java.util.ArrayList;

public class Course {
    private String topic;
    private String instructor;
    private ArrayList<Student> enrolledStudents;

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public String getTopic() {
        return topic;
    }

    public String getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudents(){
        return enrolledStudents;
    }

    public String printCourseDetails() {
        return "\nCourse: " + this.getTopic() + "\n" +
                "Instructor: " + this.getInstructor() + "\n" +
                "Enrolled Students: " + this.getEnrolledStudents();
    }
}
