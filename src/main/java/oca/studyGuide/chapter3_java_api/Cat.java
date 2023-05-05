package oca.studyGuide.chapter3_java_api;

public class Cat {

    public static void main(String[] args) {

        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");  // String is immutable, so we need to reassign
        System.out.println(s2); // 12

        StringBuilder b1 = new StringBuilder("1");
        StringBuilder b2 = b1.append("2");
        b2.append("3"); // StringBuilder is mutable
        System.out.println(b2); // 123
    }

}
