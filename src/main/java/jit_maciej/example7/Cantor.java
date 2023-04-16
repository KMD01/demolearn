package jit_maciej.example7;

import java.util.Arrays;
import java.util.Scanner;

public class Cantor {

    String[] currencies = new String[]{"PLN","EUR","USD"};
    String[] targetCurrencies = new String[2];

    public void changeMoney(){
        System.out.println("######  Polish National Cantor  ######");
        System.out.println("RATE 1 PLN--> 5 EUR ");
        System.out.println("RATE 1 PLN--> 3 USD ");
        System.out.println("Choose the source currency: "+ Arrays.toString(currencies));
        System.out.println("Input the source currency: ");
        Scanner scanner1 = new Scanner(System.in);
        String inputCurrency = scanner1.nextLine();
        System.out.println("Input the source value: ");
        String inputValue = scanner1.nextLine();

        if(inputCurrency.equals("PLN")){
            targetCurrencies[0] ="EUR";
            targetCurrencies[1] ="USD";
        }
        if(inputCurrency.equals("EUR")){
            targetCurrencies[0] ="PLN";
            targetCurrencies[1] ="USD";
        }
        if(inputCurrency.equals("USD")){
            targetCurrencies[0] ="PLN";
            targetCurrencies[1] ="EUR";
        }
        System.out.println("Choose the target currency: "+ Arrays.toString(targetCurrencies));
        System.out.println("Input the target currency: ");
        Scanner scanner2 = new Scanner(System.in);
        String targetCurrency = scanner2.nextLine();





    }

}
