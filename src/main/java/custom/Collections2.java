package custom;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collections2 {

    List<String> names10 = List.of("Kasia","Zosia","Asia","Bartek");
    List<String> names20 = names10.stream().sorted((s1,s2)->s1.length()-s2.length()).collect(Collectors.toList());

    public void sort(){
        names10.sort(String::compareTo);
    }



    Stream<String> stream1 = names10.stream();

    Set<String> names2 = Set.of("Kasia","Zosia","Asia","Bartek");
    Stream<String> stream2 = names20.stream();

    Stream<String> names3 = Stream.of("Kasia","Zosia","Asia","Bartek");

    Stream<String> names4 = Arrays.stream(new String[]{"Hania","Bruno"});
    Stream<String> stream5 = Stream.of("Kuba","Paweł");

    List<String> names5 = stream1.collect(Collectors.toList());

    IntStream intStream = IntStream.range(0,100);
    long integerList = intStream.count();

    Set<String> uniqueNames = names10.stream().distinct().collect(Collectors.toSet());
}

