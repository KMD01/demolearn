package oca;

public class Compound {

    public static void main(String[] args) {
        long x = 10;
        int y = 5;
        //y = y * x;  cast problem
        y *= x;
        System.out.println(y);

        long a = 5;
        long b = (a=4);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
