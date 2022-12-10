package studyGuide.chapter1_blocks.example9;

public class IllegalValues {
    public static void main(String[] args) {
//        double notAtStart = _1000.00; // DOES NOT COMPILE
//        double notAtEnd = 1000.00_; // DOES NOT COMPILE
//        double notByDecimal = 1000_.00; // DOES NOT COMPILE
        double annoyingButLegal = 1_00_0.0_0; // this one compiles
    }
}
