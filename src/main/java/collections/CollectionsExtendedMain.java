package collections;

import java.util.*;
import java.util.stream.Collectors;


public class CollectionsExtendedMain {

    public static void main(String[] args) throws Exception{

        //CollectionsExtended collectionsExtended = new CollectionsExtended();
        //List<String> namesA = List.of("Ka","Zosia","Joanna","Bart");
        //String namesAsorted = collectionsExtended.sortKris(namesA).;
        //System.out.println();

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        List<String> sortedCars = Arrays.stream(cars).sorted((String::compareTo)).toList();
        for (String car : sortedCars) {
            System.out.println(car);
        }

     /*   List<String> namesA = List.of("Ka","Zosia","Joanna","Bart");
        List<String> namesB = namesA.stream()
                .sorted(Comparator.comparingInt(String::length)).toList();
        for (String n : namesB){
            System.out.println(n);
        }*/








    }
}
