package studyGuide.chapter4_methods.example7_access_modifiares.duck;

public class MotherDuck {
    String noise = "qua_qua";

    void quack() {
        System.out.println(noise); // default access is ok
    }

    void makeNoise() {
        quack(); // default access is ok
    }
}
