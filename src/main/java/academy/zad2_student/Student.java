package academy.zad2_student;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Student {

    private String firstName;
    private String lastName;
    private int index;
    private Gender gender;

    public Student(String firstName, String lastName, int index, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.index = index;
        this.gender = gender;
    }

    public Student() {
    }

    public void ScanStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set first name: ");
        firstName = scanner.nextLine();
        System.out.println("Set last name: ");
        lastName = scanner.nextLine();

        String indexString;
        do {
            System.out.println("Insert 4 numbers of index.");
            System.out.println("Set index number: ");
            indexString = scanner.nextLine();
            index = Integer.parseInt(indexString);

        } while (indexString.length() != 4);



        Gender[] genderArray = Gender.values();
        for (Gender genderValue : genderArray) {
            System.out.println(genderValue);
        }

        /*List<Gender> gender = new ArrayList<>();
        gender.add(Gender.MAN);
        gender.add(Gender.WOMAN);
         for (Gender g : gender){
            System.out.println(g);
        }*/

        String genderString;
        do {
            System.out.println("Set gender: man / woman ");
            genderString = scanner.nextLine();
            switch (genderString) {
                case "man":
                    gender = Gender.MAN;
                    break;
                case "woman":
                    gender = Gender.WOMAN;
            }
            ;
        } while (!genderString.equals("man") && !genderString.equals("woman"));
    }

    public void PrintStudent() {
        System.out.println("==================");
        System.out.println("First name is: " + firstName);
        System.out.println("Last name is: " + lastName);
        System.out.println("Index number is: " + index);
        System.out.println("Gender is: " + gender);
        System.out.println("==================");
    }

    @Override
    public String toString() {
        return "Student {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", index=" + index +
                ", gender=" + gender +
                '}';
    }
}