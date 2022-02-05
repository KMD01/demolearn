package sda;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount Anna = new BankAccount(1L, 1000);
        BankAccount Kris = new BankAccount(2L, 2000);

        BankAccount.makeTransfer(Anna, Kris, 500);
    }


}
