package inheritance_overloading_overriding;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inheritance: ");
        Lion1 lion1 = new Lion1();
        lion1.makeNoise();
        lion1.run();
        System.out.println("");

        System.out.println("Overloading: ");
        Lion2 lion2 = new Lion2();
        lion2.makeNoise();
        lion2.makeNoise(10);
        lion2.run();
        System.out.println("");

        System.out.println("Overriding: ");
        Lion3 lion3 = new Lion3();
        lion3.makeNoise();





    }

}
