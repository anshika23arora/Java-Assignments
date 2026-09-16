package assignment1;
import java.util.Scanner;
public class que4_voting {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Are you a citizen? (true/false): ");
        boolean citizen = sc.nextBoolean();

        if (age >= 18 && citizen) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
        sc.close();
    }
}