package studyGuide.chapter4.duck;

public class FatherDuck {

    private String noise = "qua_qua";

    private void quack() {
        System.out.println(noise); // private access is ok
    }

    private void makeNoise() {
        quack(); // private access is ok
    }

}

