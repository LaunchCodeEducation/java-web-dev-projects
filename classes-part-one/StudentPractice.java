public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
	Student student = new Student("Your Name", 12345, 1, 4.0);

	//access properties if student took this step
	String name = student.getName();
	int studentId = student.getStudentId();
	int numberOfCredits = student.getNumberOfCredits();
	double gpa = student.getGpa();
    }
}
