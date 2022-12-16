package array_list;

public class ArrayList {
    public static void main(String[] args) {

        java.util.ArrayList<String> arrayList1 = new java.util.ArrayList();
        arrayList1.remove(0);
        java.util.ArrayList arrayList2  = new java.util.ArrayList<String>();
        java.util.ArrayList<String> arrayList3  = new java.util.ArrayList<String>();

        arrayList1.add("Door");
        arrayList2.add("Home");
        arrayList3.add("Dog");

        //arrayList1.add(1);
        arrayList2.add(1);
        //arrayList3.add(1);

        arrayList1.remove(1);
        arrayList1.remove("Kris");

        arrayList1.set(0,"setHouse");

    }

}
