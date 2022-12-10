package studyGuide.chapter5.example15;

public class Marsupial {
    public static boolean isBiped() {
        return false;
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
}

//    Marsupial walks on two legs: false
//        Kangaroo hops on two legs: true
