package jit_maciej.example2;


public class Static {

    public static void main(String[] args) {
        Cat cat1 = new Cat("kot1",30);
        Cat cat2= new Cat("kot2",40);

        cat1.number = 10;

        System.out.println(cat1.number);
        System.out.println(cat2);

    }

}
