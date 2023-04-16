package jit_maciej.example2;

public class DogMain {
    public static void main(String[] args) {

        Dog dog0 = new Dog();
        System.out.println(dog0);
        Dog dog1 = new Dog("Azor",40);
        System.out.println(dog1);
        Dog dog2 = new Dog("Burek");
        System.out.println(dog2.toString());

        System.out.println();
        System.out.println(dog2.getAge());
        dog2.setAge(100);
        System.out.println(dog2.getAge());

    }
}
