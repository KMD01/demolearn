package studyGuide.chapter1;

public class Name {
    String first = "Theodore";
    String last = "Moose";
    String full = first + last;
    //String first = first + last;  will not compile

    Name() {
        System.out.println(full);
    }

    public static void main(String[] args) {
        new Name();
    }
}