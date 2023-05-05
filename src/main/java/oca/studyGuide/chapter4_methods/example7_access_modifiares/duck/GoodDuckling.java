package oca.studyGuide.chapter4_methods.example7_access_modifiares.duck;

public class GoodDuckling {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        duck.quack(); // default access
        System.out.println(duck.noise); // default access
    }
}
