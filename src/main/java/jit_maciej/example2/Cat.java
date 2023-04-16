package jit_maciej.example2;

public class Cat {
    private String name;
    private static int age;

    public static int number = 5;

    public Cat() {
        this.name = "Wilder";
        this.age = 7;
    }


    public Cat(String name) {
        this.name = name;
        this.age = 7;
    }


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void sayMiau() {
        System.out.println(this.name + " say miau, miau, miau");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}




