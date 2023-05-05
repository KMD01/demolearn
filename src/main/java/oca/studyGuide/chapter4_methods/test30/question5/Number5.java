package oca.studyGuide.chapter4_methods.test30.question5;

public class Number5 {

    public int howMany(boolean b, boolean... b2) {
        return b2.length;
    }

    public static void main(String[] args) {
        Number5 number5 = new Number5();
        number5.howMany(true,new boolean[2]);
    }

}
