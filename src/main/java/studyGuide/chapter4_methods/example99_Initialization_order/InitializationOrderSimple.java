package studyGuide.chapter4_methods.example99_Initialization_order;

public class InitializationOrderSimple {
    private String name = "Torchie";

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }

    static {
        COUNT += 10;
        System.out.println(COUNT);
    }

    public InitializationOrderSimple() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        InitializationOrderSimple initializationOrderSimple = new InitializationOrderSimple();
    }
}
//0
//10
//Torchie
//constructor
