package games.readNumber;


import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class ReadNumber {

    public static void readNumber(){
        int tab[] = {1,2,3,4,5};
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int index = -1;

        System.out.println("Który element tablicy chcesz zobaczyć: ");
        boolean isCorrect = false;

        while(!isCorrect ) {
            try {
                index = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException n) { System.out.println("Niepoprawne dane! " +
                    "\n Który element tablicy chcesz zobaczyć: ");
            } catch (IOException e) { System.out.println("Błąd odczytu danych");
            }

            isCorrect  = index == -1? false : true;
        }

        try {
            System.out.println(tab[index-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);
        }
    }
}
