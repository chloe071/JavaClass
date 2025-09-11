package WEEK8;

import java.util.Random;
import java.util.Scanner;

public class card {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        int userTotal = 0;

        String response;
        do {
            int card = rand.nextInt(11) + 1;
            userTotal += card;
            System.out.println("You drew: " + card + ", Total: " + userTotal);

            if (userTotal >= 21) break;

            System.out.print("Do you want another card? (yes/no): ");
            response = scnr.next();
        } while (response.equalsIgnoreCase("yes"));

        int computerTotal = rand.nextInt(25) + 1;
        System.out.println("Computer total: " + computerTotal);

        if (userTotal > 21) {
            System.out.println("You busted! Computer wins.");
        } else if (computerTotal > 21 || userTotal > computerTotal) {
            System.out.println("You win!");
        } else if (userTotal < computerTotal) {
            System.out.println("Computer winds.");
        } else {
            System.out.println("It's a tie!");

        }
    }
}
