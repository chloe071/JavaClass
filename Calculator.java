import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		//read the input values for nickels, dimes, and quarters
		
		int nickels = scnr.nextInt();
		int dimes = scnr.nextInt();
		int quarters = scnr.nextInt();
		
		calculateAmount(nickels, dimes, quarters);

	}
	public static void calculateAmount(int nickels, int dimes, int quarters) {
		//Value of each denomination in dollars
		double nickelValue = 0.05;
		double dimeValue = 0.10;
		double quarterValue = 0.25;
		
		//total value of each denomination in dollars
		double nickelTotal = nickels * nickelValue;
		double dimeTotal = dimes * dimeValue;
		double quarterTotal = quarters * quarterValue;
		
		//total amount in dollars
		double totalAmount = nickelTotal + dimeTotal + quarterTotal;
		
		System.out.printf("Amount: $%.2f\n", totalAmount);
	}
}
/*
 * Output
 * Amount $1.25
*/
