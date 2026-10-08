package assignment3;

import java.util.Scanner;

class BankTransaction extends Thread {

    private double amount;

    BankTransaction(double amount) {
        this.amount = amount;
    }

    public void run() {

        if (amount >= 50000) {
            System.out.println("High-value transaction processed first");
        } else {
            System.out.println("Low-value transaction processed later");
        }
    }
}

public class que10_bank_transaction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Transaction1: ₹");
        double amount1 = sc.nextDouble();

        System.out.print("Transaction2: ₹");
        double amount2 = sc.nextDouble();

        BankTransaction transaction1 =
                new BankTransaction(amount1);

        BankTransaction transaction2 =
                new BankTransaction(amount2);

        if (amount1 >= 50000) {
            transaction1.setPriority(Thread.MAX_PRIORITY);
        } else {
            transaction1.setPriority(Thread.MIN_PRIORITY);
        }

        if (amount2 >= 50000) {
            transaction2.setPriority(Thread.MAX_PRIORITY);
        } else {
            transaction2.setPriority(Thread.MIN_PRIORITY);
        }

        transaction1.start();
        transaction2.start();

        sc.close();
    }
}