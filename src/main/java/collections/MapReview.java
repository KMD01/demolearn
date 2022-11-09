package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapReview {

    Map<String, String> namesMap = Map.of("Java", "It is a programming language", "SQL", "It is a query language.", "Scrum", "It is a type of Agile methodology.");

    //Get the all values from map
    Collection<String> values = namesMap.values();

    //Get the value from map
    String value = namesMap.get("Java");

    //Get the SET od the keys
    Set<String> setKeyNames = namesMap.keySet();

    //Get the info if map is empty
    boolean mapEmpty = namesMap.isEmpty();

    //Get the info what is the size od the map
    int mapSize = namesMap.size();

}
