package oca.studyGuide.chapter4_methods.example99_Initialization_order;

public class Chick {

    private String name = "Fluffy";

    {
        System.out.println("Instance initializers");
    }

    static {
        System.out.println("Static initializers");
    }

    Chick() {
        name = "Tiny";
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }

}
