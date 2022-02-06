package custom;

import java.util.Scanner;

public class forfive {
    public static void main(String[] args) {

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
