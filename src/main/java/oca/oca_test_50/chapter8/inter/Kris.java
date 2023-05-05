package oca.oca_test_50.chapter8.inter;

public interface Kris {

    int num1 = 1;
    public final static int num2 = 1;

    public abstract int m1();
    static int m2(){
        return 2;
    }
    default int m3(){
        return 2;
    }

}
