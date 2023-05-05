package oca.studyGuide.chapter5_class.example10;

public class Snake extends Reptile {
    protected boolean hasLegs() {
        System.out.println("hasLegs() from Child class");
        return false;
    }
    protected double getWeight() throws InsufficientDataException{
        System.out.println("getWeight from Child class");
        return 2;
    }

    public static void main(String[] args) throws InsufficientDataException {
        Snake snake = new Snake();
        snake.hasLegs();
        System.out.println("");
        Reptile reptile = new Reptile();
        reptile.hasLegs();
    }
}
