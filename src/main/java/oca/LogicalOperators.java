package oca;

public class LogicalOperators {

    public static void main(String[] args) {
        //boolean a = true;
        //boolean b = true;
        //boolean c = a | b;
        //System.out.println(c);
        int d = 3;
        int e = 6;
        int f = d<10 ? d++ : e++;

        System.out.println(f);
        f++;
        System.out.println(f);
    }
}
