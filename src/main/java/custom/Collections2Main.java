package custom;

import java.util.*;

public class Collections2Main {
    public static void main(String[] args) throws Exception{


        /*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        List<String> sortedCars = Arrays.stream(cars).sorted((String::compareTo)).collect(Collectors.toList());
        for (String car : sortedCars) {
            System.out.println(car);
        }*/

        List<String> namesA = List.of("Ka","Zosia","Joanna","Bart");
        List<String> namesB = namesA.stream()
                .sorted(Comparator.comparingInt(String::length)).toList();
        for (String n : namesB){
            System.out.println(n);
        }




    }
}
