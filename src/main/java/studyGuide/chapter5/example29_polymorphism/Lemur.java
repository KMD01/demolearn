package studyGuide.chapter5.example29_polymorphism;

public class Lemur extends Primate implements HasTail{

    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur; // Casting an object from a subclass to a superclass doesn’t require an explicit cast.
        System.out.println(hasTail.isTailStriped());
        Primate primate = lemur;
        System.out.println(primate.hasHair());

        Lemur lemur1 = (Lemur) hasTail; // Casting an object from a superclass to a subclass requires an explicit cast.

    }
}