package academy.zad5_bankAccount;

import java.util.Scanner;

public class BankAccount {

    public long accountNumber;
    public int accountBalance;

    public BankAccount(long accountNumber, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public BankAccount() {
    }

    private int showAccountBalance(){
        System.out.println("======================");
        return accountBalance;
    }

    private void validateMoneyValue(int money){
        if(money<0){
            throw new RuntimeException("Wrong amount of money.");
        }
    }

    private int withdrawal(int money){
        //validateMoneyValue(money);
        if (accountBalance>money){
            accountBalance = accountBalance - money;
            return money;
        }
            int moneyToWithdrawal = accountBalance;
            accountBalance = 0;
            return moneyToWithdrawal;
    }

    private void deposit(int money){
        //validateMoneyValue(money);
        accountBalance = accountBalance + money;
    }

    private void makeTransfer(BankAccount sender, BankAccount receiver, int money){
        int newMoney = sender.withdrawal(money);
        System.out.println("Sender account: " + sender.showAccountBalance() );
        receiver.deposit(newMoney);
        System.out.println("Receiver account: " + receiver.showAccountBalance() );
    }




    public void makeTransferQuestion(){
        BankAccount a = new BankAccount(1L, 1000);
        BankAccount b = new BankAccount(2L, 2000);
        BankAccount c = new BankAccount(3L, 3000);
        BankAccount sender = new BankAccount();
        String senderString;
        BankAccount receiver = new BankAccount();
        String receiverString;
        int money = 0;
        System.out.println("Do You want make transfer: yes / no ? ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        switch (answer){
            case "yes":
                System.out.println("Input the amount of transfer:");
                money = scanner.nextInt();
                validateMoneyValue(money);

                String[] letters = {"a","b","c"};


                System.out.println("Choose the sender: a or b or c"  );
                senderString = scanner.next();
                if (senderString.equals("a")){
                    sender = a;
                    String[] letters_a = {"b","c"};
                    letters = letters_a;
                };
                if (senderString.equals("b")){
                    sender = b;
                    String[] letters_b = {"a","c"};
                    letters = letters_b;
                };
                if (senderString.equals("c")){
                    sender = c;
                    String[] letters_c = {"a","b"};
                    letters = letters_c;
                };

                // TODO: po wybraniu sendera ,  dana literka znika z propozycji wyboru
                System.out.println("Choose the receiver: "+ letters[0] + " or "+ letters[1] );
                receiverString = scanner.next();
                if (receiverString.equals("a")){
                    receiver = a;};
                if (receiverString.equals("b")){
                    receiver = b;};
                if (receiverString.equals("c")){
                    receiver = c;};
                makeTransfer(sender,receiver,money);
                System.out.println("");
                makeTransferQuestion();
                break;

            case "no":
            System.out.println("no transfer processing");
            break;
        }



    }

}
