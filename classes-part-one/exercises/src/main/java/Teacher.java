package main.java;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSubject() {
        return subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    public void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }

    public void setLastName(String aLastName) {
        this.lastName = aLastName;
    }

    public void setSubject(String aSubject) {
        this.subject = aSubject;
    }

    public void setYearsTeaching(int aYearsTeaching) {
        this.yearsTeaching = aYearsTeaching;
    }
}
