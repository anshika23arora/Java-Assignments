package assignment2;

import java.util.Scanner;

class Vehicle {
    String regNo;
    String brand;
    double baseRate;

    Vehicle(String regNo, String brand, double baseRate) {
        this.regNo = regNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    double calculateRent() {
        return baseRate;
    }
}

class Car extends Vehicle {

    Car(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    double calculateRent() {
        return baseRate * 1.5;
    }
}

class Bike extends Vehicle {

    Bike(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    double calculateRent() {
        return baseRate * 1.2;
    }
}

public class que12_vehicle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String type1 = sc.next();
        String regNo1 = sc.next();
        String brand1 = sc.next();
        double rate1 = sc.nextDouble();

        String type2 = sc.next();
        String regNo2 = sc.next();
        String brand2 = sc.next();
        double rate2 = sc.nextDouble();

        Vehicle v1;
        Vehicle v2;

        if (type1.equalsIgnoreCase("Car")) {
            v1 = new Car(regNo1, brand1, rate1);
        } else {
            v1 = new Bike(regNo1, brand1, rate1);
        }

        if (type2.equalsIgnoreCase("Car")) {
            v2 = new Car(regNo2, brand2, rate2);
        } else {
            v2 = new Bike(regNo2, brand2, rate2);
        }

        System.out.println(type1 + " " + regNo1 + " " + brand1 +
                " Rent: " + v1.calculateRent());

        System.out.println(type2 + " " + regNo2 + " " + brand2 +
                " Rent: " + v2.calculateRent());

        sc.close();
    }
}