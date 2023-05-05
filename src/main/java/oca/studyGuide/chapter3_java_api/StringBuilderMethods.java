package oca.studyGuide.chapter3_java_api;

public class StringBuilderMethods {

    public static void main(String[] args) {

        StringBuilder name = new StringBuilder("Kris");
        name.append("X");
        System.out.println(name);
        name.append(1);
        System.out.println(name);
        name.insert(0,"a");
        System.out.println(name);
        name.delete(name.length()-1,name.length());
        System.out.println(name);
        name.reverse();
        System.out.println(name);

    }
}
