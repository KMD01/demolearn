package collections;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionsExtended {
    // Create an empty list
    List<String> emptyList = List.of();
    // Create an empty list
    List<String> newList = new ArrayList<>();
    // Create a list
    List<String> namesList = List.of("Kasia","Zosia","Asia","Bartek");
    // Sort the list
    List<String> namesListSorted = namesList.stream().sorted((s1,s2)->s1.length()-s2.length()).collect(Collectors.toList());
    // Make stream from the list
    Stream<String> namesListStream = namesList.stream();
    // Create a stream from the elements
    Stream<String> namesListStream1 = Stream.of("Kasia","Zosia","Asia","Bartek");
    // Create a stream from the array
    Stream<String> namesListStream2 = Arrays.stream(new String[]{"Hania","Bruno"});
    // Make list from a stream and use toList method
    List<String> names5 = namesListStream.collect(Collectors.toList());
    // Make list of a unique values from a stream
    List<String> uniqueNames = namesList.stream().distinct().toList();


    String allInOne1 = namesList.stream().collect(Collectors.joining(", "));
    String allInOne2 = String.join(", ", namesList);

    public void printAllInOnePrint(){
        System.out.println(allInOne2);
    }



    IntStream intStream = IntStream.range(0,100);
    long integerList = intStream.count();
}

