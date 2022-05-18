package collections;

import java.util.*;

public class CollectionsBasics {

    public static void myNumberSet() {
        final Set<Integer> numbersSet = new HashSet<>();
        numbersSet.add(1);
        numbersSet.add(3);
        numbersSet.add(2);
        numbersSet.forEach(System.out::println);
        for (final Integer number : numbersSet) {
            System.out.println(number);
        }
    }

    public static void myNumberList() {
        final List<String> numberList = new ArrayList<>();
        numberList.add("Bartek");
        numberList.add("Andrzej");
        numberList.add("Grzegorz");
        numberList.forEach(System.out::println);
        for (final String number : numberList) {
            System.out.println(number);
        }
    }

    public static void myNumberList2() {
        final List<String> numberList = new LinkedList<>();
        numberList.add("Bartek");
        numberList.add("Andrzej");
        numberList.add("Grzegorz");
        numberList.forEach(System.out::println);
        for (final String number : numberList) {
            System.out.println(number);
        }
    }

    public static void myNumberMap(){
        final Map<Integer, String > numberMap = new HashMap<>();
        numberMap.put(1,"to jest pierwsza definicja");
        numberMap.put(2,"to jest druga definicja");
        numberMap.put(3,"to jest trzecia definicja");
        for (String number: numberMap.values()) {
            System.out.println(number);
        }
        //Get the all values from map
        Collection values = numberMap.values();

        //Get the value from map
        String value = numberMap.get(1);

        //Get the SET od the keys
        Set<Integer> setKeyNames = numberMap.keySet();

        //Get the info if map is empty
        boolean mapEmpty = numberMap.isEmpty();

        //Get the info what is the size od the map
        int mapSize = numberMap.size();


    }
}
