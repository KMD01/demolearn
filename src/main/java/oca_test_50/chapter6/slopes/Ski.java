package oca_test_50.chapter6.slopes;

import java.util.Arrays;

public class Ski {
    private int age = 18;

    private static void slalom(Ski racer, int[] speed, String name) {
        racer.age = 19;
        name = "Wendy";
        speed = new int[1];
        racer = null;
    }


    public static void main(String[] args) {
        final Ski mySkier = new Ski();
        mySkier.age = 20;
//        System.out.println(mySkier.age);
        final int[] mySpeed = new int[1];
        String myName = "Rossie";
        slalom(mySkier, mySpeed, myName);
        System.out.println(mySkier.age);
        System.out.println(Arrays.toString(mySpeed));
        System.out.println(myName);
    }

}
