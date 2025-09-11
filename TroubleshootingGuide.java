/*
 * HEADER BLOCK COMMENT
 * Author: Chloe Cedano
 * Course: COP2250
 * Date: 2/27/2025
 * Assignment: Study Group Task & Discussion
 * Instructor: Sergio Pisano
 * Description: This program asks the user a series of questions and provides corresponding troubleshooting suggestions beased on their responses.
 */
import java.util.Scanner;
public class TroubleshootingGuide {
   public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String answer;
		
		//step 1 reboot computer
		System.out.println("Reboot the computer and try to connect. Did that fix the problem? (yes/no)");
		answer = scnr.nextLine().trim().toLowerCase();
		
		//if the issue is resolved, exit the program
		if (answer.equals("yes")) {
			System.out.println("Problem fixed! Your computer is connected.");
			return;
		}
		//step 2 reboot the router
		System.out.println("Reboot the router and try to connect. Did that fix the problem? (yes/no)");
		answer = scnr.nextLine().trim().toLowerCase();
		
		//if the issue is resolved exit the program
		if (answer.equals("yes")) {
			System.out.println("Problem fixed! Your computer is connected.");
			return;
		}
		//step 3 check cables between router and modem
		System.out.println("Make sure the cables between the router & modem are plugged in firmly. Did that fix the problem? (yes/no");
		answer = scnr.nextLine().trim().toLowerCase();
		
		//if the issue is resolved exit the program
		if (answer.equals("yes")) {
			System.out.println("Problem fixed! Your computer is connected.");
			return;
		}
		//step 4 move the router to a different location
		System.out.println("Move the router to a new location and try to connect. Did that fix the problem? (yes/no)");
		answer = scnr.nextLine().trim().toLowerCase();
		
		//if the issue is resolved exit the program
		if (answer.equals("yes")) {
			System.out.println("Problem fixed! Your computer is connected.");
			return;
		}
		//final step if none of the steps worked suggest replacing the router
		System.out.println("Get a new router.");
		//close scanner
		scnr.close();
	}
}
/*
 * CODE OUTPUT
 * Reboot the computer and try to connect. Did that fix the problem? (yes/no)
 * no
 * Reboot the router and try to connect. Did that fix the problem? (yes/no)
 * yes
 * Problem fixed! Your computer is connected. 
 */