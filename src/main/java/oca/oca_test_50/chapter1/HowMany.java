package oca.oca_test_50.chapter1;

public class HowMany {
    public int howMany(boolean b, boolean... b2) {
        System.out.println(b2.length);
        return b2.length;
    }

    public static void main(String[] args) {
        HowMany howMany = new HowMany();
        System.out.println("true");
        howMany.howMany(true);
        System.out.println("true, true");
        howMany.howMany(true, true);
        System.out.println("true, true, true");
        howMany.howMany(true, true, true);
        System.out.println("true, {true}");
        howMany.howMany(true, new boolean[2]);
    }
}
