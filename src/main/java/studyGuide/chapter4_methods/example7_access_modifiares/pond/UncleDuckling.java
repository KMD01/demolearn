package studyGuide.chapter4_methods.example7_access_modifiares.pond;


import studyGuide.chapter4_methods.example7_access_modifiares.duck.UncleDuck;

public class UncleDuckling extends UncleDuck {
    public void makeNoise() {
        quack();
        //UncleDuckling uncleDuckling = new UncleDuckling();
        //uncleDuckling.quack();
        System.out.println(noise); // DOES NOT COMPILE
        } }


