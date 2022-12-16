package length;

import java.util.ArrayList;

public class Length {

    public static void main(String[] args) {

        // STRING - length()
        String string = "Krzysztof";
        int l1 = string.length();

        //STRING BUILDER - capacity() and length()
        StringBuilder sb = new StringBuilder("Krzysztof");
        int sb1 = sb.capacity();
        int sb2 = sb.length();

        // ARRAY - length
        String[] array= new String[3];
        int l2 = array.length;

        // LIST - size()
        ArrayList arrayList = new ArrayList();
        int l3 =  arrayList.size();

    }

}
