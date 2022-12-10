package studyGuide.chapter5.example16;

public class Kangaroo extends Marsupial {
    public boolean isBiped() {
        return true;
    }
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }
    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
}

//        Marsupial walks on two legs: true
//        Kangaroo hops on two legs: true