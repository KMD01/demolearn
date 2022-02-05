package sda;

public class PersonMain {
    public static void main(String[] args){

        Person person = new Person("Janek", "Kowalski");

        person.SayHello();
        person.print();

        person.SayHelloWithAddingName("Chris");
        person.print();

        person.setLastName("Kowalska");
        person.SayHello();
        person.print();
    }
}
