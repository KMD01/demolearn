package custom;

import java.io.*;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.Collections;

public class TempMain  extends  Format {
    public static void main(String[] args) throws Exception {

       /* int count = 0;
        System.out.println("Count is: " + count);
        ROW_LOOP: for(int row = 1; row <=3; row++) {
            System.out.println("Outer:");
            System.out.println("Row: " + row);


            for (int col = 1; col <= 2; col++) {
                System.out.println("Inner:");
                System.out.println("Col: " + col);
                System.out.println("");
                if (row * col % 2 == 0) break;
                count++;
                System.out.println("Col new " + count);
            }
        }
        System.out.println("");
        System.out.println("Result: " + count);*/

       /* int[][] twoD = {{1,2,3},{4,5,6},{7,8,9}};
        LOOP: for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++){
                System.out.print(twoD[i][j] + " ");} // print element
            System.out.println(); // time for a new row
        }*/


        /*List<Integer> list = Arrays.asList(10, 4, -1, 5);
        Collections.sort(list);
        Integer array[] = list.toArray(new Integer[4]);
        System.out.println(array[0]);
        LocalDate.of(2015, Calendar.MONTH,12);

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter your name");
        String name=br.readLine();
        System.out.println("Welcome "+name);

        ConsoleColors console = new ConsoleColors();
        console.wait(1000);*/

        File file = new File("\"E:\\kris.txt\"");
        FileReader fileReader = new FileReader(file.getPath());
        System.out.println(fileReader);















    }

    @Override
    public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
        return null;
    }

    @Override
    public Object parseObject(String source, ParsePosition pos) {
        return null;
    }
}
