package studyGuide.chapter2;

public class Increment {
    int num1;
    int num2;

    void simpleAdding(){
        System.out.println("Simple adding +1 :");
        num1 = 1;
        num2 = num1 + 1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    void postIncrement() {

        System.out.println("Pre-increment:");
        num1 = 1;
        num2 = num1++;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    void preIncrement() {
        System.out.println("Pre-increment:");
        num1 = 1;
        num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("");
    }

    public static void main(String[] args) {
        Increment increment = new Increment();
        increment.simpleAdding();
        increment.postIncrement();
        increment.preIncrement();
    }


}
