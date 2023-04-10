package Course;

public class TeacherClass {
    //2
    //There should be some infos about all teachers ==> name, surname, branch and phone number
    //there should be constructors to create teacher objects
    //there should be a method for printing teacher's information

    //Es sollten Infos zu allen Lehrern vorhanden sein ==> Vorname, Nachname, Branche und Telefonnummer

    private String name;
    private String surname;
    private String branch;
    private String phoneNumber;

    //constructor
    public TeacherClass(String name, String surname, String branch, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.branch = branch;
        this.phoneNumber = phoneNumber;
    }

    //constructor default
    public TeacherClass() {
    }

    //getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //method toString for information. it should be return type
    public String toString(TeacherClass teacher){

        return "Name : " + this.name + "\n"
              +"Surname : " + this.surname + "\n"
              +"Branch : " + this.branch+ "\n"
              +"Phone Number : " + this.phoneNumber + "\n"
              + " "  ;
    }
}
