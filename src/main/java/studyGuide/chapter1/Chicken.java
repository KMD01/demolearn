package studyGuide.chapter1;

public class Chicken {
    String name = "Joe";

    public Chicken() {
        name = "Duke";// initialize in constructor
    }

    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        System.out.println(chicken.name);
    }

}
