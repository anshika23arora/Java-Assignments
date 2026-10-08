package assignment3;

import java.util.Scanner;

class PrinterJob implements Runnable {

    private int studentNumber;
    private int jobNumber;

    PrinterJob(int studentNumber, int jobNumber) {
        this.studentNumber = studentNumber;
        this.jobNumber = jobNumber;
    }

    public void run() {

        try {
            System.out.println("Printing job " + jobNumber
                    + " by Student " + (char)('A' + studentNumber - 1));

            Thread.sleep(500);

        } catch (InterruptedException e) {
            System.out.println("Printing interrupted");
        }
    }
}

public class que8_university_printing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of print jobs: ");
        int n = sc.nextInt();

        Thread[] threads = new Thread[n];

        for (int i = 0; i < n; i++) {

            PrinterJob job = new PrinterJob(i + 1, i + 1);

            threads[i] = new Thread(job);
            threads[i].start();
        }

        sc.close();
    }
}