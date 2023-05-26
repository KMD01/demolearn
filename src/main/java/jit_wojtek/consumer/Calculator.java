package jit_wojtek.consumer;

import java.util.function.Consumer;

public class Calculator implements IntegerConsumer,Consumer<Integer> {

    // method from 'IntegerConsumer' interface
    @Override
    public void printInteger() {
        System.out.println("from Interface: Integer Consumer");
    }

    // method from 'Consumer' interface
    @Override
    public void accept(Integer integer) {
        System.out.println("from Interface: Customer<Integer> ");
    }
}
