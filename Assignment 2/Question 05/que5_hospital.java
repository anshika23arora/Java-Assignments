package assignment2;

import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Age: " + age;
    }
}

class Doctor extends Person {
    protected String specialization;

    // Constructor chaining
    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Specialization: " + specialization;
    }
}

class Surgeon extends Doctor {
    private String surgeryType;

    // Constructor chaining
    public Surgeon(String name, int age, String specialization, String surgeryType) {
        super(name, age, specialization);
        this.surgeryType = surgeryType;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Surgery Type: " + surgeryType;
    }
}

public class que5_hospital {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter person details (name,age,specialization,surgeryType):");

        String[] data = sc.nextLine().split(",");

        String name = data[0].trim();
        int age = Integer.parseInt(data[1].trim());
        String specialization = data[2].trim();
        String surgeryType = data[3].trim();

        Surgeon surgeon = new Surgeon(
                name,
                age,
                specialization,
                surgeryType
        );

        System.out.println();
        System.out.println(surgeon);

        sc.close();
    }
}