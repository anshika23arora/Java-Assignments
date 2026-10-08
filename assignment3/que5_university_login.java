package assignment3;

import java.util.Scanner;

class UniversityLogin {

    void login(String username) {

        try {
            if (username == null) {
                throw new NullPointerException("Username cannot be null");
            }

            System.out.println("Login successful for " + username);

        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

public class que5_university_login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        if (username.equalsIgnoreCase("null")) {
            username = null;
        }

        UniversityLogin obj = new UniversityLogin();
        obj.login(username);

        sc.close();
    }
}