package oca.studyGuide.chapter1_blocks.example2;

public class Chick {
    private String name = "Fluffy";

    {
        System.out.println("setting field");
    }

    public Chick() {
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}

// static -> instance -> constructor
//setting field
//setting constructor
//Tiny

