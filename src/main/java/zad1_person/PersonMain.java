package zad1_person;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Person person = new Person("Janek", "Kowalski");

        System.out.println("Example 1:");
        person.SayHey();
        person.ShowActualName(); //Janek
        System.out.println("Example 2:");
        System.out.println("Input new name:");
        person.SayHeyWithNewFirstName(scanner.next());
        person.ShowActualName(); //Janek
        System.out.println("Example 3:");
        System.out.println("Input new name:");
        person.setFirstName(scanner.next());
        person.SayHey();
        person.ShowActualName(); //Paul
    }
}
