package inheritance_overloading_overriding;

public class Animal {
    private int age;

    Animal(){
    }

    Animal(int age){
        this.age = age;
    }

    public void makeNoise(){
        System.out.println("Animal makes noise");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


