package methods;

public class StripMethod {

    public static void useStripMethod(String name){
        String strippedName = name.strip();
        String kk = name.intern();
        System.out.println(strippedName);
    }

}
