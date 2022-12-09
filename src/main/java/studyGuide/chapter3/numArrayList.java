package studyGuide.chapter3;

import java.util.ArrayList;

public class numArrayList {

    public static void main(String[] args) {

        //       FIRST LIST:
        ArrayList list1 = new ArrayList();
        list1.add("Hawk"); // we can add all objects
        list1.add(1);
        list1.add(true);
        list1.remove(1);
        System.out.println(list1);
        list1.set(1,"john");
        System.out.println(list1);

        //      SECOND LIST:
        ArrayList<String> list2 = new ArrayList(10);
        list2.add("Hawk"); // we can add only Strings
        list2.add("1");
        list2.add("true");

        //      THIRD LIST:
        ArrayList list3 = new ArrayList(list2);

    }

}
