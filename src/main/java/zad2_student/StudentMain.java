package sda;

public class StudentMain {

    public static void main(String[] args) {

        Student student = new Student();
        student.ScanStudent();
        student.PrintStudent();
        System.out.println();
        System.out.println("Name is: " + student.getFirstName());
        System.out.println("Gender is: " + student.getGender());

        System.out.println(student.toString());
    }
}
