import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below

        Student myself = new Student("Katy", 12345, 1, 4.0);
        System.out.println("Name: " + myself.getName() + " Student ID: " + myself.getStudentId() + " Number of " +
                "Credits:" + myself.getNumberOfCredits() + " GPA: " + myself.getGpa() + "\n");

        Teacher newTeacher = new Teacher("Mary", "Johnson", "Math", 4);
        System.out.println("Teacher Name: "+newTeacher.getFirstName() + " " + newTeacher.getLastName() +
                        "\nSubject: " + newTeacher.getSubject() + "\nYears Teaching: " + newTeacher.getYearsTeaching());

    }
}
