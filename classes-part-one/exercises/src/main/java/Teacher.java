public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private Double yearsTeaching;

    public Teacher (String firstName, String lastName, String subject, Double yearsTeaching) {
        this.firstName = firstName;
        this.lastName =  lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getName() {
        return (firstName + " " + lastName);
    }

    public void setName(String aFirstName, String aLastName) {
        firstName = aFirstName;
        lastName = aLastName;
    }

    public String getSubject() {
        return subject;
    }

    private void setSubject(String aSubject) {
        subject = aSubject;
    }

    public Double getYearsTeaching(){
        return yearsTeaching;
    }

    private void setYearsTeaching(Double aYearsTeaching) {
        yearsTeaching = aYearsTeaching;
    }
}
