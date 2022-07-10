package strings;

import org.apache.logging.log4j.util.Strings;

import java.util.List;

public class StringsMethods {

    public static void use1_strip(){
        String clearName = "Kris";
        System.out.println(clearName);
        String result1 = clearName.strip();
        System.out.println(result1);

        String nameWithWhiteSpace = " Anna ";
        System.out.println(nameWithWhiteSpace);
        String result2 = nameWithWhiteSpace.strip();
        System.out.println(result2);
    }

    public static void use2_length(){
        String clearName = "Kris";
        System.out.println(clearName);
        int result = clearName.length();
        System.out.println(result);
    }

    public static void use3_concat(){
        String clearName = "Kris";
        System.out.println(clearName);
        String result = clearName.concat(" Kros");
        System.out.println(result);
    }

    public  static void use4_join() {
        List<String> namesList = List.of("Kasia", "Zosia", "Asia", "Bartek");
        List<String> uniqueNames = namesList.stream().distinct().toList();
        String allInOne2 = String.join(", ", namesList);
    }
}
