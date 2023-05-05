package oca.oca_test_50.chapter1;

import java.util.function.Predicate;

public class Kris {
    public static void main(String[] args) {
        System.out.println(test(i -> i == 5));
//        System.out.println(test(i -> { i == 5;})); brak return
        System.out.println(test((i) -> i == 5));
//        System.out.println(test((int i) -> i == 5));  // wywalić int
//        System.out.println(test((int i) -> {return i == 5;}));  // wywalić int
        System.out.println(test((i) -> {
            return i == 5;
        }));
    }

    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
    }
}
