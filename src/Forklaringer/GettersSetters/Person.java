package Forklaringer.GettersSetters;

public class Person {
    public String fName;
    private String lName;
    private String ssn;

    public Person(String fName, String lName, String ssn) {
        this.fName = fName;
        this.lName = lName;
        this.ssn = ssn;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getSsn() {
        return ssn;
    }

    public void  changeName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

}
