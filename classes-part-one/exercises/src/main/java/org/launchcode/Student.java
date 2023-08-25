public class Student {
        public String name;
        public int studentId;
        public int numberOfCredits = 0;
        public double gpa = 0.0;

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.
        public String getName(){
                return name;
        }
        public int getStudentId() {
                return studentId;
        }
        public int getNumberOfCredits(){
                return numberOfCredits;
        }
        public double getGpa(){
                return gpa;
        }

        public void setName(String name){
                this.name = name;
        }
        public void setStudentId(int studentId){
                this.studentId = studentId;
        }
        private void setNumberOfCredits(int numberOfCredits){
                this.numberOfCredits = numberOfCredits;
        }
        public void setGpa(double gpa){
                this.gpa = gpa;
        }
}
