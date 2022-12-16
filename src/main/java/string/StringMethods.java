package string;


import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;

public class StringMethods {

    public static void use1_strip() {
        String clearName = "Kris";
        System.out.println(clearName);
        String result1 = clearName.strip();
        System.out.println(result1);

        String nameWithWhiteSpace = " Anna ";
        System.out.println(nameWithWhiteSpace);
        String result2 = nameWithWhiteSpace.strip();
        System.out.println(result2);
    }

    public static void use2_length() {
        String clearName = "Kris";
        System.out.println(clearName);
        int result = clearName.length();
        System.out.println(result);
    }

    public static void use3_concat() {
        String clearName = "Kris";
        System.out.println(clearName);
        String result = clearName.concat(" Kros");
        System.out.println(result);
    }

    public static void use4_join() {
        List<String> namesList = List.of("Kasia", "Zosia", "Asia", "Bartek");
        List<String> uniqueNames = namesList.stream().distinct().toList();
        String allInOne2 = String.join(", ", namesList);
    }

    public static void use5_substring() {
        String name = "Krzysztof";
        String newName = name.substring(1, name.length() - 1);
        System.out.println(name);
        System.out.println(newName);
    }

    public static void use6_format() {
        final SecureRandom secureRandom = new SecureRandom();
        final int generated = secureRandom.nextInt(9999);
        final String otp = String.format("%06d", generated);
    }

    public static void use7_asii(){
        String data = "Java";
        int result = 0;
        for (int x = 0; x < data.length(); x++) {
            result += data.toLowerCase(Locale.ROOT).charAt(0);
        }
        System.out.println(result);
    }

    public static void use8_replace(){
        String name = "Krzysztof";
        System.out.println(name);
        String nameReplaced = name.replace("K","G");
        System.out.println(nameReplaced);
    }

    public static void use9_reassign(){
        String name = "Krzysztof";
        name = "Anna";
    }

    public static void use10_equal(){
        String a = "Krzysztof";
        String b = "Krzysztof";
        String c = null;
        String d = new String(a);
        String e = new String("Krzysztof");
        System.out.println("a==b "+ (a==b));
        System.out.println("a==c "+ (a==c));
        System.out.println("a==d "+ (a==d));
        System.out.println("a==e "+ (a==e));
        System.out.println();
        System.out.println("a.equals(b) "+ (a.equals(b)));
        System.out.println("a.equals(c) "+ (a.equals(c)));
        System.out.println("a.equals(d) "+ (a.equals(d)));
        System.out.println("a.equals(e) "+ (a.equals(e)));
    }

}
