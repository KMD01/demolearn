package oca.studyGuide.chapter4_methods.example12_passing;

public class Webby {

    public static void main(String[] args) {
        String name = "Webby";
        speak(name);
        System.out.println(name);
    }
    public static void speak(String name) {
        name = "Sparky";
    }

}
