package jit_maciej.example8;

import jit_maciej.example2.Cat;

import java.util.ArrayList;
import java.util.List;

public class Kolekcje {
    public static void main(String[] args) {

        List<Cat> list = new ArrayList<>();
        list.add(new Cat("burek",23));
        System.out.println(list);

    }
}
