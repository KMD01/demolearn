package games;
import custom.ConsoleColors;

import java.util.Scanner;

public class Play {

    public static void play() {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Set first name:");
        System.out.println();
        String firstName = scanner.nextLine();
        System.out.print("Set last name:");
        System.out.println();
        String lastName = scanner.nextLine();
        System.out.print("Set age:");
        System.out.println();
        String age = scanner.nextLine();

        int wordLenght = Math.max(Math.max(firstName.length(),lastName.length()),age.length());

        for(int i=0;i<(23+wordLenght);i++){
            System.out.print("|");}

        System.out.println();
        System.out.print("| Your first name is " + firstName + "." );
        for(int i=0;i<=(wordLenght-firstName.length()-1);i++){
            System.out.print(" ");}
        System.out.println("|");

        System.out.print("| Your last name is " + lastName + "." );
        for(int i=0;i<=(wordLenght-lastName.length());i++){
            System.out.print(" ");}
        System.out.println("|");

        System.out.print("| Your age is " + age + ".");
        for(int i=0;i<=(6+wordLenght-age.length());i++){
            System.out.print(" ");}
        System.out.println("|");

        for(int i=0;i<(23+wordLenght);i++){
            System.out.print("|");}
        System.out.println(" ");
        repeat();
    }

    public static void repeat(){
        System.out.println(ConsoleColors.BLUE_BACKGROUND + "Repeat: Y/N ?" + ConsoleColors.RESET );
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if(answer.equals("Y") || answer.equals("y")){
            for (int i = 0; i < 50; ++i) System.out.println();
            System.out.println("Lets play again");
            System.out.println(" ");
            play();
            System.out.println(" ");
        }
        if(answer.equals("N") || answer.equals("n")){
            System.out.println(ConsoleColors.BLUE + "Over" + ConsoleColors.RESET);
        }
        if(!answer.equals("Y") && !answer.equals("N")&& !answer.equals("y") && !answer.equals("n") ){
            System.out.println("Please answer using 'Y - YES' or 'N - NO' as answer.");
            repeat();
        }
    }
}






