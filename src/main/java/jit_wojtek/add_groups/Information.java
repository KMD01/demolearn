package jit_wojtek.add_groups;

import java.util.List;

public class Information {

    public static void getInfo(List<Type> types){
        if(types != null){
            System.out.println(types);
        }else{
            List<Type> allTypes = List.of(Type.values());
            System.out.println(allTypes);
        }
    }

    public static void main(String[] args) {
        Information.getInfo(null);
        List<Type> types1 = List.of(Type.BASIC);
        Information.getInfo(types1);
    }
}
