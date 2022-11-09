package function;

import java.util.function.Function;

public class FunctionReview {
    Function<Integer, String> function100 = x -> String.valueOf(x + 100);
    Function<Integer, String> function200 = x -> String.valueOf(x + 200);
    Function<Integer, String> function300 = x -> "300";

    public void krisMethod(int value, Function<Integer, String> fun) {
        System.out.println(fun.apply(value));
    }

    public void object(int value) {
        System.out.println(add100(value));
    }

    private int add100(int number) {
        return number + 100;
    }
}
