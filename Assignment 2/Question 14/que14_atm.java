package assignment2;

import java.util.Scanner;

class Account {
    private String accNo;
    private String holderName;
    private double balance;

    Account(String accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    double getBalance() {
        return balance;
    }
}

public class que14_atm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account account = new Account("A101", "Rahul", 0);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String operation = sc.next();

            if (operation.equalsIgnoreCase("deposit")) {
                double amount = sc.nextDouble();
                account.deposit(amount);

            } else if (operation.equalsIgnoreCase("withdraw")) {
                double amount = sc.nextDouble();
                account.withdraw(amount);

            } else if (operation.equalsIgnoreCase("getBalance")) {
                System.out.println("Balance: " + account.getBalance());
            }
        }

        sc.close();
    }
}