package array;

import java.util.Arrays;

public class ArrayReview {

    public void use_01_equals(){
        int [] arrayA= {6,-4,12,0,-10};
        int [] arrayB= {6,-4,12,0,-10};
        boolean a = Arrays.equals(arrayA,arrayB);
        System.out.println(a);
    }

    public void use_02_checkLength(){
        int [] array= {6,-4,12,0,-10};
        int l1 = array.length;
    }

    public void use03_binarySearch(){
        int[] random = { 6, -4, 12, 0, -10 };
        Arrays.sort(random);
        int x = 12;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);
    }

    public static void use04_arrayString() {
        String name = "Krzysztof";
        char[] nameArray = name.toCharArray();
        Arrays.sort(nameArray);
        for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i]);
        }
    }
}
