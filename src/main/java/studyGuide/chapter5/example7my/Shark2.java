package studyGuide.chapter5.example7my;

public class Shark2 extends Fish {
    private int age;
    private final int size;         // dałem 'final', bo było podkreślone przez InteliJ
    private final int numberOfFins; // dałem 'final', bo było podkreślone przez InteliJ

    public Shark2(int age, int size, int numberOfFins) {
        super(age);
        this.size = size;
        this.numberOfFins = numberOfFins;
    }

    public void displaySharkDetails() {
        System.out.print("Shark with age: " + getAge());
        System.out.print(" and " + size + " meters long");
        System.out.print(" with " + numberOfFins + " fins");
    }

    public static void main(String[] args) {
        new Shark2(10,100,5).displaySharkDetails();
    }


}
