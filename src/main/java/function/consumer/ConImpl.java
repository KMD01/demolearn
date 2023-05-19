package function.consumer;

import java.util.function.Consumer;

public class ConImpl implements Consumer<Integer> {

    @Override
    public void accept(Integer nu) {
        System.out.println(nu);
    }
}
