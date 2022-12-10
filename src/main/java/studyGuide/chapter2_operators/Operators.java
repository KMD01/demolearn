package studyGuide.chapter2_operators;

public class Operators {

    boolean val1 = false;
    boolean val2 = false;

    void checkAnd(){
        if(val1 & val2){
            System.out.println("&: ");
            System.out.println("val1 = " + val1);
            System.out.println("val2 = " + val2);
        }
    }

    void checkAnd2(){
        if(val1 && val2){
            System.out.println("&&: ");
            System.out.println("val1 = " + val1);
            System.out.println("val2 = " + val2);
        }
    }

    void checkOr(){
        if(val1 | val2){
            System.out.println("I: ");
            System.out.println("val1 = " + val1);
            System.out.println("val2 = " + val2);
        }
    }

    void checkOr2(){
        if(val1 || val2){
            System.out.println("||: ");
            System.out.println("val1 = " + val1);
            System.out.println("val2 = " + val2);
        }
    }

    public static void main(String[] args) {
        Operators operators = new Operators();
        operators.checkAnd();
        operators.checkAnd2();
        operators.checkOr();
        operators.checkOr2();
    }



}
