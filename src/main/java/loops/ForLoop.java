package loops;

import java.util.Scanner;

public class ForLoop {

    public static void useForLoop(){
        Scanner scanner = new Scanner(System.in);
        String typ;
        for (int j = 0; j <5 ; j++) {
            System.out.println("Podaj typ:");
            typ=scanner.next();
            if (typ.equals("dom")) {
                break;
            }
        }
    }
}
