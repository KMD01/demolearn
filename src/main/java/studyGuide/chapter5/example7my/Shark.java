package studyGuide.chapter5.example7my;

public class Shark extends Fish {
    private int numberOfFins;

    public Shark(int age, int size, int numberOfFins) {
        super(age);
        super.size = size;
        super.numberOfFins = numberOfFins;
    }

    public void displaySharkDetails() {
        System.out.print("Shark with age: " + getAge());
        System.out.print(" and " + size + " meters long");
        System.out.print(" with " + numberOfFins + " fins");
    }

    public static void main(String[] args) {
        new Shark(10,100,5).displaySharkDetails();
    }


}
