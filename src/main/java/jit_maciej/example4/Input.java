package jit_maciej.example4;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("magic");
        System.out.println("twoja liczba to:" + number);
    }
}
