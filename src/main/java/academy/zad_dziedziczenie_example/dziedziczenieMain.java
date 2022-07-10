package academy.zad_dziedziczenie_example;

public class dziedziczenieMain {
    public static void main(String[] args) {

        Pracownik pracownik = new Pracownik("Kris","Kowalski");
        Manager manager = new Manager("Ania","Kowalska");

        Osoba[] osoby = new Osoba[2];
        osoby[0] = pracownik;
        osoby[1] = manager;

        for (int i = 0; i <osoby.length ; i++) {
            osoby[i].przedstawSię();
        }


    }
}
