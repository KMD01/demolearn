package function.consumer;

import jit_wojtek.consumer.Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(100, 200, 300);
        List<Integer> values2 = new ArrayList<>();

        // solution 0
        ConsumerReview.print(values);
        // solution 1
        Consumer<Integer> consumer1 = new Calculator();
        //solution 2
        Consumer<Integer> consumer2 = integer -> System.out.println(integer);
        values.forEach(consumer2);
        //solution 3
        values2.addAll(values);
        //solution 4
        values.forEach(System.out::println);


    }
}
