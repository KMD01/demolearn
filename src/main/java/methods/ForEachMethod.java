package methods;

import java.util.HashSet;
import java.util.Set;

public class ForEachMethod {
    public static void myNumberSet() {
        final Set<Integer> numbersSet = new HashSet<>();
        numbersSet.add(1);
        numbersSet.add(3);
        numbersSet.add(2);
        numbersSet.forEach(number -> System.out.println(number));
        numbersSet.forEach(System.out::println);
        for (final Integer name : numbersSet) {
            System.out.println(name);
        }
    }

}








