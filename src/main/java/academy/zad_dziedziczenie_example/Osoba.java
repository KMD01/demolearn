package academy.zad_dziedziczenie_example;

public class Osoba {

    String imie;
    String nazwisko;

    void przedstawSię(){
        System.out.println("hej, jestem: " + imie);
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}
