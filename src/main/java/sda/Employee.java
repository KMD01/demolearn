package sda;

public class Employee extends Person {

    int salary;

    public Employee(String firstName, String lastName, int salary){
        super(firstName,lastName);
        this.salary=salary;
    }

    public void helloEmployee(){
        System.out.println("hej, jestem " + firstName + getLastName());
    }

}