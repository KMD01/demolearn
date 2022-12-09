package studyGuide.chapter2;

import java.util.ArrayList;
import java.util.List;

public class ArrayAndList {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 3;
        int l = numbers.length;
        System.out.println(numbers);
        System.out.println();
        for (int i = 0; i < l; i++) {
            System.out.println(numbers[i]);
        }

        List<String> names = new ArrayList<>();
        names.add("Kris");
        names.add("Kros");
        int s = names.size();
        System.out.println(names);
        for (String name: names) {
            System.out.println(name);
        }
    }
}
