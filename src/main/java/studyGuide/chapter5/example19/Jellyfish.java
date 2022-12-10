package studyGuide.chapter5.example19;

public class Jellyfish extends Animal {
    public int length = 5;
    public static void main(String[] args) {
        Jellyfish jellyfish = new Jellyfish();
        Animal animal = new Jellyfish();
        System.out.println(jellyfish.length);
        System.out.println(animal.length);
    }
}
