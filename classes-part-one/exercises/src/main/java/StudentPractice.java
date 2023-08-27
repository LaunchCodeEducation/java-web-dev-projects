import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below
        Student me = new Student();
        me.setName("Brittney");
        me.setStudentId(12345);
        me.setNumberOfCredits(1);
        me.setGpa(4.0);
        Student cali = new Student();
        cali.setName("Cali");
        cali.setStudentId(67890);
        cali.setNumberOfCredits(1);
        cali.setGpa(4.0);
        System.out.println(me.printStudentDetails());
        System.out.println(cali.printStudentDetails());
        Teacher teacher1 = new Teacher();
        teacher1.setFirstName("Peggy");
        teacher1.setLastName("Hill");
        teacher1.setSubject("Español");
        teacher1.setYearsTeaching(21.5);
        System.out.println(teacher1.printTeacherDetails());
        Course spanish = new Course();
        spanish.setTopic("Spanish");
        spanish.setInstructor(teacher1.getFirstName() + " " + teacher1.getLastName());
        ArrayList<Student> students = new ArrayList<>();
        students.add(me);
        students.add(cali);
        spanish.setEnrolledStudents(students);
        System.out.println(spanish.printCourseDetails());
    }
}