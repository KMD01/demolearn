package jit_maciej.example5;

public class Tasks {

    public static void checkTheDay(int dayNumber){

        switch(dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thuseday");
                break;
            case 3:
                System.out.println("Wendsday");
                break;
            case 4:
                System.out.println("Thursdayy");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("bad argument");
                break;
        }
    }

    public static void drawXmassTree(int height){
        String star = "*";
        for (int i = 0; i < height ; i++) {
            System.out.println(star);
            star=star+"*";

        }

    }














}
