package control_structures;

public class ControlStructuresReview {

    public void useIf(int count){
        if (count > 2) {
            System.out.println("Count is higher than 2");
        } else {
            System.out.println("Count is lower or equal than 2");
        }
    }

    public void useTernaryOperator(int count){
        System.out.println(count > 2 ? "Count is higher than 2" : "Count is lower or equal than 2");
    }


    public void useSwitch(int number) {
        switch (number) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
        }
    }
}
