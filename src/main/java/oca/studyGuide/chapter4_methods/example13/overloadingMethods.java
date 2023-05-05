package oca.studyGuide.chapter4_methods.example13;

public class overloadingMethods {

    public void fly(int numMiles) { }
    public void fly(short numFeet) { }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception { }

}
