package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRefactor {
    public static void main(String[] args) {

        ArrayList arrayList1 = new ArrayList();
        //arrayList1.remove(0);
        List<String> arrayList2  = new ArrayList<>();
        List<String> arrayList3  = new ArrayList<>();

        arrayList1.add("Door1");
        arrayList1.add("Door2");
        arrayList1.add("Door3");
        arrayList2.add("Home");
        arrayList3.add("Dog");

        //arrayList1.add(1);
        //arrayList2.add(1);
        //arrayList3.add(1);

        //arrayList1.remove(1);
        //arrayList1.remove("Kris");

        //arrayList1.set(0,"setHouse");

        System.out.println(arrayList1);
        System.out.println(arrayList1.get(2));
        loop:
        for (int i=0, j =0;i<10; i++,j++){
            System.out.println(i);


        }
    }
}
