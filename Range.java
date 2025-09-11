package WEEK8;

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int start, stop;

        System.out.print("Enter a start value: ");
        start = scnr.nextInt();

        do {
            System.out.print("Enter a stop value (must be large than start): ");
            stop = scnr.nextInt();
        } while (stop <= start);

        System.out.println("Even numbers between " + start + " and " + stop + ":");
        for (int i = start; i <= stop; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
        }
    }
}
