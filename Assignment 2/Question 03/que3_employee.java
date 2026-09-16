package assignment2;

import java.util.Scanner;

class Employee {
    private String name;
    private String id;
    private double basicSalary;

    // Default constructor
    public Employee() {
        this.name = "";
        this.id = "";
        this.basicSalary = 0;
    }

    // Parameterized constructor - constructor chaining
    public Employee(String name, String id, double basicSalary) {
        this();
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    // Method to calculate salary
    public double calculateSalary() {
        return basicSalary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    // toString() overriding
    @Override
    public String toString() {
        return "Employee " + name + " (" + id + ") Salary: " + calculateSalary();
    }
}

class Manager extends Employee {
    private double bonus;

    // Manager constructor - calls parent constructor
    public Manager(String name, String id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    // Method overriding
    @Override
    public double calculateSalary() {
        return getBasicSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager " + getName() + " (" + getId() + ") Salary: " + calculateSalary();
    }
}

public class que3_employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input for Employee
        String employeeInput = sc.nextLine();
        String[] employeeData = employeeInput.split(",");

        String employeeName = employeeData[1];
        String employeeId = employeeData[2];
        double employeeSalary = Double.parseDouble(employeeData[3]);

        // Input for Manager
        String managerInput = sc.nextLine();
        String[] managerData = managerInput.split(",");

        String managerName = managerData[1];
        String managerId = managerData[2];
        double managerSalary = Double.parseDouble(managerData[3]);
        double bonus = Double.parseDouble(managerData[4]);

        // Create objects
        Employee employee = new Employee(
                employeeName,
                employeeId,
                employeeSalary
        );

        Manager manager = new Manager(
                managerName,
                managerId,
                managerSalary,
                bonus
        );

        // Display output
        System.out.println(employee);
        System.out.println(manager);

        sc.close();
    }
}