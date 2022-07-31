package kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTask {
    public static int[] countPositivesSumNegatives(int[] input){
        int[] result = new int[2];
        List<Integer> negativeList = new ArrayList<>();
        List<Integer> positiveList = new ArrayList<>();
        for (int arrayElement : input) {
            if (arrayElement  <= 0) {
                negativeList.add(arrayElement);
            } else {
                positiveList.add(arrayElement);
            }
        }
        int positivesElement = positiveList.size();
        result[0] = positivesElement;

        int negativeElement = 0;
        for (int i : negativeList) {
            negativeElement = negativeElement + i;
        }
        result[1] = negativeElement;
        System.out.println(Arrays.toString(result));
        return result;
    }
}
