package collections;

import java.util.*;
import java.util.stream.IntStream;

public class StreamReview {

    public static void anyMatchElement(List<Integer> justList, int value) {
        boolean match =justList.stream().anyMatch(number->number.equals(value));
        List<Integer> match2 = justList.stream().filter(number -> number.equals(value)).toList();
        System.out.println(match);
    }
    public static void sumOfElementsByReduce(List<Integer> justList) {     
        //int sumValue =justList.stream().reduce(0,(total,element)->total+element);
        int sumValue =justList.stream().reduce(0, Integer::sum);
        System.out.println(sumValue);
    }

    public static void maxElementByReduce(List<Integer> justList) {       
        System.out.println(justList.iterator());
        int maxValue =justList.stream().reduce(0,Integer::max);
        System.out.println(maxValue);
    }
    public static void makeListFromArray(List<Integer> justList){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        List<String> sortedCars = Arrays.stream(cars).sorted((String::compareTo)).toList();
        for (String car : sortedCars) {
            System.out.println(car);
        }
    }
    public static void sortElements1(){
        List<String> namesList = List.of("Kate","Anna","Joe","Brandon");
        List<String> sortedCars = namesList.stream().sorted((String::compareTo)).toList();
        for (String car : sortedCars) {
            System.out.println(car);
        }
    }
    
    public static void sortElements2(){
        List<String> namesList = List.of("Kate","Anna","Joe","Brandon");
        List<String> namesB = namesList.stream().sorted(Comparator.comparingInt(String::length)).toList();
        }

    public void useIntStream(){
        IntStream intStream = IntStream.range(0,100);
        long integerRandomNumber = intStream.count();
        long number = intStream.count();
        }


    }
