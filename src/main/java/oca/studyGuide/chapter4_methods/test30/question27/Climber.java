package oca.studyGuide.chapter4_methods.test30.question27;

public class Climber {
    public static void main(String[] args) {
//        check((h, l) -> h.append(l).isEmpty(), 5);   //sztuczka polega, że tutaj pierwszy argument jest brany jako STRINGBUILDER
    }

    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10))
            System.out.println("too high");
        else
            System.out.println("ok");
    }
}
