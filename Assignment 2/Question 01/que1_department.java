package assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Professor class
class Professor {
    private String name;
    private String employeeId;
    private String specialization;

    // Default constructor
    public Professor() {
    }

    // Parameterized constructor
    public Professor(String name, String employeeId, String specialization) {
        this.name = name;
        this.employeeId = employeeId;
        this.specialization = specialization;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getSpecialization() {
        return specialization;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Professor Name: " + name
                + ", Employee ID: " + employeeId
                + ", Specialization: " + specialization;
    }
}


// Department class
class Department {
    private String deptName;
    private String hodName;
    private List<Professor> professors;

    // Default constructor
    public Department() {
        professors = new ArrayList<>();
    }

    // Parameterized constructor
    public Department(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
        this.professors = new ArrayList<>();
    }

    // Getters
    public String getDeptName() {
        return deptName;
    }

    public String getHodName() {
        return hodName;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    // Setters
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setHodName(String hodName) {
        this.hodName = hodName;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    // Method to add professor
    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    // Override toString()
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("Department Name: ").append(deptName).append("\n");
        result.append("HOD Name: ").append(hodName).append("\n");
        result.append("Professors:\n");

        for (Professor professor : professors) {
            result.append(professor).append("\n");
        }

        return result.toString();
    }
}


// Main class
public class que1_department {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input department details
        System.out.println("Enter Department details (deptName,hodName)");
        String deptDetails = sc.nextLine();

        String[] deptData = deptDetails.split(",");

        String deptName = deptData[0].trim();
        String hodName = deptData[1].trim();

        Department department = new Department(deptName, hodName);

        // Input number of professors
        System.out.println("Enter number of professors");
        int n = Integer.parseInt(sc.nextLine());

        // Input professor details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter professor details (name,employeeId,specialization)");

            String professorDetails = sc.nextLine();
            String[] professorData = professorDetails.split(",");

            String name = professorData[0].trim();
            String employeeId = professorData[1].trim();
            String specialization = professorData[2].trim();

            Professor professor =
                    new Professor(name, employeeId, specialization);

            department.addProfessor(professor);
        }

        // Display output
        System.out.println(department);

        sc.close();
    }
}