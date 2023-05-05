package oca.studyGuide.chapter4_methods.test30.question28;

import java.util.ArrayList;
import java.util.List;

public class Kris {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.removeIf(s -> s.isEmpty());
        list.removeIf(s -> { return s.isEmpty();});
        //list.removeIf(s -> {s.isEmpty();});
        //list.removeIf(String s -> s.isEmpty());
        list.removeIf((String s) -> s.isEmpty());
    }
}
