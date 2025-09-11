package WEEK8;

import java.util.Scanner;

public class validation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number between 1 and 10: ");
            number = scnr.nextInt();
        } while (number < 1 || number > 10);

        System.out.println("Number entered: " + number);
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
