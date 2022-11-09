package array;

import java.util.Arrays;

public class ArrayReview {

    public static void use_arrayString() {
        String name = "Krzysztof";
        char[] nameArray = name.toCharArray();
        Arrays.sort(nameArray);
        for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i]);
        }
    }
}
