package oca;

public class Tolls {

    private static int yesterday = 1;
    int tommorrow = 10;

    public static void main(String[] args) {

        Tolls tolls = new Tolls();
        int today = 20, tommorow = 40;
        System.out.println(today + tolls.tommorrow + tolls.yesterday);

    }
}
