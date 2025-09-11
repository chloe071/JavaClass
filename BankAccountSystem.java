/*
 * HEADER COMMENT BLOCK
 * Author: Chloe Cedano
 * Course: COP2250
 * Date: 3/22/2025
 * Assignment: Study Group Task & Discussion: Loops
 * Instructor: Sergio Pisano
 * Description: Practice programing loops by creating a Java program in Eclipse, debugging, and running it. 
 */
import java.util.Scanner;
public class BankAccountSystem {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		//Account details
		String accountHolderName;
		double balance = 0.0;

		//input account holder's name
		System.out.print("Enter the account holder's name: ");
		accountHolderName = scnr.nextLine();

		//loop for bank operations
		boolean continueBanking = true;

		while (continueBanking) {
			System.out.println("\nChoose an operation:");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			int choice = scnr.nextInt();

			switch (choice) {
			case 1 : //deposit
				System.out.print("Enter amount to deposit: ");
				double depositAmount = scnr.nextDouble();
				if (depositAmount > 0) {
					balance += depositAmount;
					System.out.printf("Successfully deposited $%.2f. New balance: $%.2f%n", depositAmount, balance);
				} else {
					System.out.println("Deposit amount must be positive.");
				}
				break;

			case 2: //withdraw
				System.out.print("Enter amount to withdraw: ");
				double withdrawAmount = scnr.nextDouble();
				if (withdrawAmount > 0 && withdrawAmount <= balance) {
					balance -= withdrawAmount;
					System.out.printf("Successfully withdrew $%.2f. New balance: $%.2f%n", withdrawAmount, balance);
				} else {
					System.out.println("Invalid withdrawl amount.");
				}
				break;

			case 3: //check balance
				System.out.printf("Current balance: $%.2f%n", balance);
				break;

			case 4: //exit
				continueBanking = false;
				System.out.println("Thank you for using the banking system!");
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
			}

		}

		scnr.close();

	}

}
/*CODE OUTPUT
 * Enter the account holder's name: Chloe

Choose an operation:
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter your choice: 
1
Enter amount to deposit: 1000
Successfully deposited $1000.00. New balance: $1000.00

Choose an operation:
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter your choice: 
2
Enter amount to withdraw: 600
Successfully withdrew $600.00. New balance: $400.00

Choose an operation:
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter your choice: 
4
Thank you for using the banking system!
 */