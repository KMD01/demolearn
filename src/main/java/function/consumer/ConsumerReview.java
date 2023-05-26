package function.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerReview {

    public static void print(List<Integer> numbersList) {
        numbersList.forEach(System.out::println);
    }

    Consumer<String> names(Integer number){
        return name -> System.out.println(number + name);
    }

    Consumer<String> myNumber = names(10);

    public void printStrings(List<String> stringList){
        stringList.forEach(myNumber);
    }
}
