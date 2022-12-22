package oca_test_50.chapter6.ship;

public class Phone {
    //CHARTER 6-example39
    private int size;

    public Phone(int size) {
        this.size = size;
    }

    public static void sendHome(Phone p, int newSize) {
        p = new Phone(newSize);
        p.size = 4;
    }

    public static Phone sendHomeReturn(Phone p, int newSize) {
        p = new Phone(newSize);
        p.size = 5;
        return p;
    }

    public static final void main(String... params) {
        Phone phone = new Phone(3);
        //sendHome(phone, 7);
        phone = sendHomeReturn(phone, 8);
        System.out.print(phone.size);
    }
}