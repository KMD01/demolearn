package methods;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnyMatchMethod {

    public static void matchElement() {
        final Set<Integer> numbersSet = new HashSet<>();
        numbersSet.add(10);
        numbersSet.add(100);
        numbersSet.add(49);
        boolean match =numbersSet.stream().anyMatch(number->number.equals(49));
        List<Integer> match2 = numbersSet.stream().filter(number -> number.equals(49)).toList();
        System.out.println(match);
    }

}
