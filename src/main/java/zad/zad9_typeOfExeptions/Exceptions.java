package zad.zad9_typeOfExeptions;

import java.util.Scanner;

public class Exceptions {

    public static void expTypes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj licznik:");
        int number1 = scanner.nextInt();
        System.out.println("Podaj mianownik:");
        int number2 = scanner.nextInt();
        //case 1:
        System.out.println(count(number1,number2));



        System.out.println("Podaj licznik:");
        int number3 = scanner.nextInt();
        System.out.println("Podaj mianownik:");
        int number4 = scanner.nextInt();
        // case 2:
        System.out.println(countRuntimeException(number3,number4));

        System.out.println("Podaj licznik:");
        int number5 = scanner.nextInt();
        System.out.println("Podaj mianownik:");
        int number6 = scanner.nextInt();
        //case 3:
        try {
            System.out.println(countException(number5,number6));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static int count (int a, int b){
        System.out.println("Przykład 1");
        if (b==0){
            System.out.println("System opis: Nie wolno dzielić przez zero");
            return 0;
        } else{
            return a/b;
        }
    }

    private static int countRuntimeException (int a, int b){
        System.out.println("Przykład 2");
        if (b==0){
            throw new RuntimeException("RuntimeException opis: Nie wolno dzielić przez zero");
        } else{
            return a/b;
        }
    }

    private static int countException (int a, int b) throws Exception {
        System.out.println("Przykład 3");
        if (b==0){
            throw new Exception("Exception opis: Nie wolno dzielić przez zero");
        } else{
            return a/b;
        }
    }



}
