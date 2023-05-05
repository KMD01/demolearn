package oca.studyGuide.chapter5_class.example2;

public class Zebra extends Animal {
    public Zebra(int age) {
        super(age);
        System.out.println("Zebra constructor with 1 argument.");
    }
    public Zebra() {
        this(100);
        System.out.println("Zebra constructor with 0 argument.");
    }

    public static void main(String[] args) {
        new Zebra();
    }
}
