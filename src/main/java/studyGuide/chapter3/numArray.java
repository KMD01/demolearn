package studyGuide.chapter3;

import java.util.Arrays;

public class numArray {

    public static void main(String[] args) {

        int[] numbers1 = new int[10];
        for (int i = 0; i < numbers1.length; i++)
            numbers1[i] = i + 5; // brak nawiasów bloku - zatem 1 linia zostanie wykonana


        int[] numbers2 = new int[10];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = i + 5;
            System.out.println(numbers2[i]);
        }

        Arrays.sort(numbers1);

        int[] numbers = {2, 4, 6, 8};
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 2));    // 0
        System.out.println(Arrays.binarySearch(numbers, 4));    // 1
        System.out.println(Arrays.binarySearch(numbers, 1));    // -1
        System.out.println(Arrays.binarySearch(numbers, 3));    // -2
        System.out.println(Arrays.binarySearch(numbers, 9));    // -5


    }

}
