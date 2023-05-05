package loops;

public class BreakContinueLearn {

    public static void checkBreak(int a){
        System.out.println("start BREAK:");

        for (int i = 0; i < 10; i++) {
            if(i==3){
                break;}
            System.out.println(i);
        }
        System.out.println("end BREAK.");
    }

    public static void checkContinue(int a){
        System.out.println("start CONTINUE:");
        for (int i = 0; i < 10; i++) {
            if(i==3){
                continue;}
            System.out.println(i);
        }
        System.out.println("end CONTINUE. ");
    }

    public static void main(String[] args) {
        BreakContinueLearn.checkBreak(9);
        System.out.println("");
        BreakContinueLearn.checkContinue(9);
    }


}
