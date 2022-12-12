package studyGuide.chapter4_methods.test30.question12;

public class RopeSwing {
    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();
    {
        System.out.println(rope1.length);
    }
    public static void main(String[] args) {
        rope1.length = 2;
        rope2.length = 8;
        Rope.length=10;
        System.out.println(rope1.length);
    }
}
