package assignment1;
import java.util.Scanner;
public class que9_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers;
        numbers = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        int maximum = numbers[0];
        for (int i = 1; i < 10; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }
        System.out.println("Maximum value: " + maximum);
        sc.close();
    }
}