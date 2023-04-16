package jit_maciej.example2;

public class Dog {
    private String name;
    private int age;

    public Dog() {
        this.name="Rocket";
        this.age=7;
    }


    public Dog(String name) {
        this.name=name;
        this.age=15;
    }


    public Dog(String name, int age) {
        this.name=name;
        this.age=age;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
