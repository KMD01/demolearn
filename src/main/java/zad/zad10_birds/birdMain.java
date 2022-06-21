package zad.zad10_birds;

public class birdMain {
    public static void main(String[] args) {
        Birds birds = new Birds();
        birds.sing();

        Stork stork = new Stork();
        stork.sing();

        Cuckoo cuckoo = new Cuckoo();
        cuckoo.sing();

        Birds b = new Stork();
        b.sing();



    }
}
