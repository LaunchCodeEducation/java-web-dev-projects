public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, StudentPractice.
        public void setName(String name) {
                this.name = name;
        }

        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }

        public void setGpa(double gpa) {
                this.gpa = gpa;
        }

        public void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }

        public String getName() {
                return name;
        }

        public int getStudentId() {
                return studentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }

        public String printStudentDetails() {
                return "\nStudent: " + this.getName() + "\n" +
                        "Student ID: " + this.getStudentId() + "\n" +
                        "Number of Credits: " + this.getNumberOfCredits() + "\n" +
                        "GPA: " + this.getGpa();
        }
}
