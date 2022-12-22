package oca.chapter7;

public interface Kris {
    static void play1(){};
    public abstract void play2();
    default void play3(){};
}
