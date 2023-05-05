package oca.studyGuide.chapter5_class.example13_hiding_static_methods;

public class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }
    public static void main(String[] args) {
        Panda.eat();
    }
}
