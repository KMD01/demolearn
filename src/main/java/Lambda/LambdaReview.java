package Lambda;



public class LambdaReview {

    public static void main(String[] args) {
        A a = System.out::println;
        a.show(50);
    }
}
