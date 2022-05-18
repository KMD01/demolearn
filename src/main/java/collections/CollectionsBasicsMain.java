package collections;


import java.util.stream.IntStream;

public class CollectionsBasicsMain {

    public static void main(String[] args) {

        //CollectionsBasics.myNumberSet();
        //CollectionsBasics.myNumberList();
        //CollectionsBasics.myNumberList2();
        //CollectionsBasics.myNumberMap();

        IntStream intStream = IntStream.range(0,6);
        long integerRandomNumber = intStream.count();
        System.out.println(integerRandomNumber);

    }
}
