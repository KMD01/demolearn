package studyGuide.chapter4_methods.test30.question24;

public class Order1 {
    final String value1 = "1";
    static String value2 = "2";
    String value3 = "3";
    {
        value2="e"; // static value in non-static
        value3="f";
    }
    static {
        value2="h";
        //value3="f";
    }
}
