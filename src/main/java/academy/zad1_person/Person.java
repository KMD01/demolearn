package academy.zad1_person;

public class Person {

    protected String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName=lastName;
    }

    public Person(String firstName,String lastName ,int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void SayHey() {
        System.out.println("hey, May name is :" + firstName);
    }

    public void SayHeyWithNewFirstName(String newFirstName) {
        System.out.println("hey, May first name is :" + newFirstName);
    }

    public void ShowActualName() {
        System.out.println("Actual name is:" + firstName);
    }

    public String getFirstName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
