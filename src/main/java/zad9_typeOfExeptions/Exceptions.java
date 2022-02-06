package sda;

public class Exceptions {


    public static void aa(){
        //case 1:
        System.out.println(count(3,4));
        // case 2:
        System.out.println(countRuntimeException(3,4));
        //case 3:
        try {
            System.out.println(countException(3,4));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static int count (int a, int b){
        if (b<0){
            System.out.println("Liczba B jest ujemna");
            return 0;
        } else{
            return a/b;
        }
    }

    public static int countRuntimeException (int a, int b){
        if (b<0){
            throw new RuntimeException("Liczba B jest ujemna");
        } else{
            return a/b;
        }
    }

    public static int countException (int a, int b) throws Exception {
        if (b<0){
            throw new Exception("Liczba B jest ujemna");
        } else{
            return a/b;
        }
    }



}
