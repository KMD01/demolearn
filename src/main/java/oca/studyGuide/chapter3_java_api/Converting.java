package oca.studyGuide.chapter3_java_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converting {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("kris");
        names.add("kros");
        names.add("home");
        names.add("town");

        Object[] namesArray = names.toArray();
        List<Object> names2 = Arrays.asList(namesArray);
    }
}
