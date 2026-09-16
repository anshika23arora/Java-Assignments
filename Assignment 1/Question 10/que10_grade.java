package assignment1;
import java.util.Scanner;
public class que10_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int sum = 0;
        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
        }
        double average = sum / 5.0;
        System.out.println("\nTotal Marks: " + sum);
        System.out.println("Average Marks: " + average);
        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
        sc.close();
    }
}