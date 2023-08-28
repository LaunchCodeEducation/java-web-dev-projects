import java.util.HashMap;
import java.util.Map;

public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below

        Student isaMe = new Student("Drew", 1, 1, 4.0);
//        isaMe.setName("Drew");
//        isaMe.setStudentId(1);
//        //isaMe.setNumberOfCredits(1);
//        isaMe.setGpa(4.0);
        System.out.println(isaMe.getName() + isaMe.getGpa());

        HashMap <String, String> emptyGrades = new HashMap<>();

        Course poetryTwo = new Course("Poetry 210", 4, emptyGrades);
        poetryTwo.setGrade(isaMe.getName(), "A");
        System.out.println(poetryTwo.getGrades());
//        for (Map.Entry<String, String> entry : poetryTwo.getGrades().entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
        Teacher wPudding = new Teacher("Wilson", "Pudding", "Culinary", 5.0);
        System.out.println(wPudding.getName());
        System.out.println(wPudding.getSubject());
        System.out.println((wPudding.getYearsTeaching()) + " years teaching");
    }
    //System.out.println(isaMe);
}
