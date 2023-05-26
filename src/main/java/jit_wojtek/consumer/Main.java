package jit_wojtek.consumer;

public class Main {

    public static void main(String[] args) {

        //tworzymy obiekt z klasy który implementuje nasz interface'y
        Calculator calculator = new Calculator();

        // do metody, która  przyjmuje interface , wkłądamy oiekt klasy, który implementuje interface
        myMethod(calculator);

        // do metody, która  przyjmuje interface, możemy włożyć lambde, która wpełnia warunki kontarktu, w naszym przypadku: "nic nie przyjmuje, nic nie dostracza"
        myMethod(() -> System.out.println("from lambda"));
    }

    // metoda, któa przyjmuje jako argument: interface
    public static void myMethod(IntegerConsumer integerConsumer) {
        integerConsumer.printInteger();
    }
}
