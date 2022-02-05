package sda;


public class EmployeeMain {
    public static void main(String[] args) {
        //Employee employee = new Employee("Krzysztof","Dyk", 38);
        //employee.helloEmployee();

        Employee employee = new Employee("Anna", "Dyk", 1000);


        Person[] person = new Person[1];
        person[0] = employee;
        for (int i = 0; i < person.length; i++) {
            person[i].SayHello();
        }





    }
}
