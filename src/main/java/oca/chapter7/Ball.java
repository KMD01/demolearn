package oca.chapter7;

abstract class Ball {
    protected final int size;

    public Ball(int size) {
        this.size = size;
    }


    protected static int size2;

    static {
        size2 = 20;
    }


}