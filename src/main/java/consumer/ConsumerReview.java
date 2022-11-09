package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerReview {

    public static void print(List<Integer> numbersList) {
        numbersList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(100, 200, 300);
        // solution 0
        ConsumerReview.print(values);
        // solution 1
        Consumer<Integer> consumer1 = new ConImpl();
        values.forEach(consumer1);
        //solution 2
        Consumer<Integer> consumer2 = integer -> System.out.println(integer);
        values.forEach(consumer2);
        //solution 3
        values.forEach(integer -> System.out.println(integer));
        //solution 4
        values.forEach(System.out::println);
    }
}
