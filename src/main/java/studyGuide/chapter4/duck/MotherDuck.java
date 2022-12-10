package studyGuide.chapter4.duck;

public class MotherDuck {
    String noise = "qua_qua";

    void quack() {
        System.out.println(noise); // default access is ok
    }

    void makeNoise() {
        quack(); // default access is ok
    }
}
