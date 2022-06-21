package methods;

import java.util.HashSet;
import java.util.Set;

public class ReduceMethod {

    public static void sumOfElements() {
        final Set<Integer> numbersSet = new HashSet<>();
        numbersSet.add(10);
        numbersSet.add(100);
        numbersSet.add(49);
        //int sumValue =numbersSet.stream().reduce(0,(total,element)->total+element);
        int sumValue =numbersSet.stream().reduce(0, Integer::sum);
        System.out.println(sumValue);
    }

    public static void maxElement() {
        final Set<Integer> numbersSet = new HashSet<>();
        numbersSet.add(10);
        numbersSet.add(100);
        numbersSet.add(49);
        System.out.println(numbersSet.iterator());
        int maxValue =numbersSet.stream().reduce(0,Integer::max);
        System.out.println(maxValue);
    }




}
