package sda;

public class BankAccount {


    public long accountNumber;
    public int accountBalance;

    public BankAccount(long accountNumber, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public void showAccountBalance(){
        System.out.println(accountBalance);
    }

    public void deposit(int money){
        accountBalance = accountBalance + money;
    }

    public int withdrawal(int money){
        if (accountBalance>money){
            accountBalance = accountBalance - money;
            return money;
        }
            int moneyToWithdrawal = accountBalance;
            accountBalance = 0;
            return moneyToWithdrawal;
    }

    public static void makeTransfer(BankAccount sender, BankAccount reciver, int money){
        sender.withdrawal(money);
        sender.showAccountBalance();
        reciver.deposit(money);
        reciver.showAccountBalance();
    }
}
