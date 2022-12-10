package studyGuide.chapter5_class.example10;

public class Reptile {
    protected boolean hasLegs() throws InsufficientDataException {
        System.out.println("hasLegs() from Parent class");
        throw new InsufficientDataException();
    }
    protected double getWeight() throws Exception {
        System.out.println("getWeight() from Parent class");
        return 2;
    }
}
