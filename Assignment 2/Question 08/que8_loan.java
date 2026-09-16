package assignment2;

import java.util.Scanner;

abstract class Loan {
    protected double principal;
    protected double rate;
    protected double time;

    public Loan(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    abstract double calculateInterest();
}

class HomeLoan extends Loan {

    public HomeLoan(double principal, double time) {
        super(principal, 8, time);
    }

    @Override
    double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

class CarLoan extends Loan {

    public CarLoan(double principal, double time) {
        super(principal, 10, time);
    }

    @Override
    double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

public class que8_loan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Home Loan input
        String[] homeData = sc.nextLine().split(",");
        double homePrincipal = Double.parseDouble(homeData[1]);
        double homeTime = Double.parseDouble(homeData[2]);

        // Car Loan input
        String[] carData = sc.nextLine().split(",");
        double carPrincipal = Double.parseDouble(carData[1]);
        double carTime = Double.parseDouble(carData[2]);

        Loan homeLoan = new HomeLoan(homePrincipal, homeTime);
        Loan carLoan = new CarLoan(carPrincipal, carTime);

        System.out.println("Home Loan Interest: " + homeLoan.calculateInterest());
        System.out.println("Car Loan Interest: " + carLoan.calculateInterest());

        sc.close();
    }
}