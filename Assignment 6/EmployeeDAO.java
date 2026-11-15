package com.example.employee;
import java.sql.*;
public class EmployeeDAO {

    // Database connection details
    private static final String URL =
            "jdbc:mysql://localhost:3306/company_db";

    private static final String USER = "root";

    // Replace with your actual MySQL password
    private static final String PASSWORD = "2003";

    // Establish database connection
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Add a new employee
    public static void addEmployee(int id, String name,
                                   String department, double salary) {
        String sql = "INSERT INTO employees VALUES (?, ?, ?, ?)";
        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, department);
            ps.setDouble(4, salary);
            ps.executeUpdate();
            System.out.println("Employee added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Display all employees
    public static ResultSet viewEmployees(Connection con)
            throws SQLException {
        String sql = "SELECT * FROM employees";
        Statement st = con.createStatement();
        return st.executeQuery(sql);
    }
}
