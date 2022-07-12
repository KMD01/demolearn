package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListReview {

    // Create an empty list
    List<String> emptyList = List.of();
    // Create an empty list
    List<String> newList = new ArrayList<>();
    // Create a list
    List<String> namesList = List.of("Kate","Anna","Joe","Brandon");

    // Sort the list

    public static void forEachMethod(List<String> exampleList) {
        exampleList.forEach(System.out::println);
        }


    public static void forIMethod(List<String> exampleList) {
        for (final String number : exampleList) {
            System.out.println(number);
        }
    }

    // Make stream from the list
    Stream<String> namesListStream = namesList.stream();
    // Sort the list
    List<String> namesListSorted = namesList.stream().sorted((s1,s2)->s1.length()-s2.length()).collect(Collectors.toList());
    // Create a stream from the elements
    Stream<String> namesListStream1 = Stream.of("Kasia","Zosia","Asia","Bartek");
    // Create a stream from the array
    Stream<String> namesListStream2 = Arrays.stream(new String[]{"Hania","Bruno"});
    // Make list from a stream and use toList method
    List<String> names5 = namesListStream.collect(Collectors.toList());
    // Make list of a unique values from a stream
    List<String> uniqueNames = namesList.stream().distinct().toList();
    // Make string from list
    String allInOne = namesList.stream().collect(Collectors.joining(", "));
}
