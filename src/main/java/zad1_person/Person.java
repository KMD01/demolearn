package sda;

import java.util.Date;

public class Person {

    protected String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName=lastName;
    }

    public Person(String firstName, int birthYear) {
        this.firstName = firstName;
    }

    public void SayHello() {
        System.out.println("hey, May name is :" + firstName);
    }

    public void SayHelloWithAddingName(String name2) {
        System.out.println("hey, May name is :" + name2);
    }

    public void print() {
        System.out.println("Actual name is:" + firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
