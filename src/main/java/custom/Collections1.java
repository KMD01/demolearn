package custom;

import java.util.*;


public class Collections1 {

    public static void myNumberSet() {
        final Set<Integer> numbersSet = new HashSet<>();
        numbersSet.add(1);
        numbersSet.add(3);
        numbersSet.add(2);
        numbersSet.forEach(System.out::println);
        for (final Integer name : numbersSet) {
            System.out.println(name);
        }
    }

    public static void myNumberList() {
        final List<String> numberList = new ArrayList<>();
        numberList.add("Bartek");
        numberList.add("Andrzej");
        numberList.add("Grzegorz");
        numberList.forEach(System.out::println);
        for (final String name : numberList) {
            System.out.println(name);
        }
    }

    public static void myNumberList2() {
        final List<String> numberList = new LinkedList<>();
        numberList.add("Bartek");
        numberList.add("Andrzej");
        numberList.add("Grzegorz");
        numberList.forEach(System.out::println);
        for (final String name : numberList) {
            System.out.println(name);
        }
    }
}
