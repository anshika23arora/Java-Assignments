
package com.example.employee;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.util.Vector;

public class EmployeeForm extends JFrame {

    JTextField idField, nameField, deptField, salaryField;
    JButton submitButton, viewButton;
    JTable table;

    public EmployeeForm() {

        setTitle("Employee Management System");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));

        formPanel.add(new JLabel("Employee ID:"));
        idField = new JTextField();
        formPanel.add(idField);

        formPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        formPanel.add(nameField);

        formPanel.add(new JLabel("Department:"));
        deptField = new JTextField();
        formPanel.add(deptField);

        formPanel.add(new JLabel("Salary:"));
        salaryField = new JTextField();
        formPanel.add(salaryField);

        submitButton = new JButton("Submit");
        viewButton = new JButton("View All Employees");

        formPanel.add(submitButton);
        formPanel.add(viewButton);

        add(formPanel, BorderLayout.NORTH);

        table = new JTable();
        add(new JScrollPane(table), BorderLayout.CENTER);

        submitButton.addActionListener(e -> addEmployee());
        viewButton.addActionListener(e -> viewEmployees());

        setVisible(true);
    }

    void addEmployee() {
        try {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            String dept = deptField.getText();
            double salary = Double.parseDouble(salaryField.getText());

            String url = "jdbc:mysql://localhost:3306/company_db";
            String user = "root";
            String password = "YOUR_MYSQL_PASSWORD";

            Connection con = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO employees VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, dept);
            ps.setDouble(4, salary);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this,
                    "Employee Added Successfully!");

            con.close();

            idField.setText("");
            nameField.setText("");
            deptField.setText("");
            salaryField.setText("");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    void viewEmployees() {
        try {
            String url = "jdbc:mysql://localhost:3306/company_db";
            String user = "root";
            String password = "2003";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM employees");
            DefaultTableModel model = new DefaultTableModel(
                    new String[]{"ID", "Name", "Department", "Salary"}, 0);
            while (rs.next()) {
                model.addRow(new Object[]{
                        rs.getInt("emp_id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary")
                });
            }
            table.setModel(model);
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    public static void main(String[] args) {
        new EmployeeForm();
    }
}
