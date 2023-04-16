package jit_maciej.example6;

public class Amount {

    int[] banknotes = new int[]{500, 200, 100, 50, 20, 10};

    public void countAmount(int amount) {
        for (int i = 0; i < banknotes.length; i++) {
            amount = divideByBanknote(amount, 0, banknotes[i]);
        }
    }

    private int divideByBanknote(int amount, int counter, int money) {
        while (!(amount - money < money && amount - money < 0)) {
            counter++;
            amount = amount - money;
        }
        System.out.println("Ilość banknotów o nominale " + money + " = " + counter + ". Reszta to: " + amount);
        return amount;
    }
}
