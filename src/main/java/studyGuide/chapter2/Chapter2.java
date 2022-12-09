package studyGuide.chapter2;

public class Chapter2 {
    int num1;
    int num2;
    void increment() {
        num1 = 1;
        num2 = num1++;
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void main(String[] args) {
        Chapter2 chapter2 = new Chapter2();
        chapter2.increment();
    }


}
