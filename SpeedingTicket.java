/*
 * HEADER COMMENT BLOCK
 * Author: Chloe Cedano
 * Course COP2250
 * Date: 2/27/2025
 * Assignment: zyLab (LM): Speeding Ticket
 * Instructor: Sergio Pisano
 * Description: Calculates the traffic ticket amount with the speed limit and sriving speed in miled per hour.
 */
import java.util.Scanner;
public class SpeedingTicket {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//read speed limit and drving speed from input
		int speedLimit = scnr.nextInt();
		int drivingSpeed = scnr.nextInt();
		
		//calculate the difference between driving speed and speed limit
		int speedDifference = drivingSpeed - speedLimit;
		//default ticket amount is 0
		int ticketAmount = 0;
		
		//determine ticket amount based on speed difference
		if (speedDifference <= -10) {
			ticketAmount = 50;
		} else if (speedDifference >= 6 && speedDifference <= 20) {
			ticketAmount = 75;
		} else if  (speedDifference >= 21 && speedDifference <= 40) {
			ticketAmount = 150;
		} else if (speedDifference > 40) {
			ticketAmount = 300;
		}
		
		//output the ticket amount
		System.out.println(ticketAmount);
	}
}
/*
 * CODE OUTPUT
 * 75
 */
