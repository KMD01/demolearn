package inheritance_overloading_overriding;

public class Lion2 extends Animal {

    void run(){
        System.out.println("Lion2 is running");
    }

    public int  makeNoise(int number){
        System.out.println("Lion2 makes noise - overloading");
        return 10;

    }

}
