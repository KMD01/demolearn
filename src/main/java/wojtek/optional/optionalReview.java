package wojtek.optional;


import java.util.Optional;

public class optionalReview {

    public void test(Integer number) {
        if (number != null) {
            printNotNull(number);
        } else {
            printNull();
        }
    }

    // when methods have void-return type use: "ifPresentOrElse"
    public void check1(Optional<Integer> number) {
        number.ifPresentOrElse(this::printNotNull, this::printNull);
    }

    // when methods have return type use: "map" and "orElseGet"
    public void check2(Optional<Integer> number) {
        number.map(this::printNotNullWithReturn).orElseGet(this::printNullWithReturn);
    }

    private void printNotNull(int number) {
        System.out.println("number " + number + " is not null :)");
    }

    private void printNull() {
        System.out.println("number is null :(");
    }

    private Integer printNotNullWithReturn(int number) {
        System.out.println("number " + number + " is not null :)");
        return number;
    }

    private Integer printNullWithReturn() {
        System.out.println("number is null :(");
        return null;
    }
}
