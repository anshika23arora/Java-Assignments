package assignment2;

import java.util.Scanner;

class Passport {
    String passportNo;
    String issueDate;
    String expiryDate;

    Passport(String passportNo, String issueDate, String expiryDate) {
        this.passportNo = passportNo;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }
}

class Citizen {
    String name;
    String dob;
    String address;
    Passport passport;

    Citizen(String name, String dob, String address, Passport passport) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Citizen: " + name +
                " DOB: " + dob +
                " Address: " + address +
                "\nPassport: " + passport.passportNo +
                " Issue: " + passport.issueDate +
                " Expiry: " + passport.expiryDate;
    }
}

public class que15_passport {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String dob = sc.next();
        String address = sc.next();

        String passportNo = sc.next();
        String issueDate = sc.next();
        String expiryDate = sc.next();

        Passport passport =
                new Passport(passportNo, issueDate, expiryDate);

        Citizen citizen =
                new Citizen(name, dob, address, passport);

        System.out.println(citizen);

        sc.close();
    }
}