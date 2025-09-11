/*
 * HEADER COMMENT BLOCK
 * Author: Chloe Cedano
 * Course: COP2250
 * Date: 4/10/2025
 * Assignment:zyLab (H)
 * Instructor:Sergio Pisano
 * Description: Stores the roster and rating information for a soccer team. 
 */
import java.util.Scanner;
public class PlayerRoster {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		final int NUM_PLAYERS = 5;
		int[] jerseyNumbers = new int[NUM_PLAYERS];
		int[] ratings = new int[NUM_PLAYERS];
		
		//input roster
		for (int i = 0; i < NUM_PLAYERS; i++) {
			System.out.println("Enter player " + (i + 1) + "'s jersey number:");
			jerseyNumbers[i] = scnr.nextInt();
			
			System.out.println("Enter player " + (i + 1) + "'s rating:");
			ratings[i] = scnr.nextInt();
			System.out.println();
		}
		//output initial roster
		printRoster(jerseyNumbers, ratings);
		
		//menu loop
		char option;
		do {
			printMenu();
			System.out.println();
			System.out.println("Choose an option:");
			option = scnr.next().charAt(0);
			
			switch (option) {
			case 'o':
				printRoster(jerseyNumbers, ratings);
				break;
			case 'u':
				updatePlayerRating(scnr, jerseyNumbers, ratings);
				break;
			case 'a': 
				outputPlayersAboveRating(scnr, jerseyNumbers, ratings);
				break;
			case 'r':
				replacePlayer(scnr, jerseyNumbers, ratings);
				break;
			case 'q':
				break;
			default:
				System.out.println("Invalid option.");
			}
		} while (option != 'q');
	}
	// output roster
	public static void printRoster(int[] jerseyNumbers, int[] ratings) {
		System.out.println("ROSTER");
		for (int i = 0; i < jerseyNumbers.length; i++) {
			System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNumbers [i] + ", Rating: " + ratings[i]);
		}
	}
	//print menu options
	public static void printMenu() {
		System.out.println("\nMENU");
		System.out.println("u - Update player rating");
		System.out.println("a - Output players above a rating");
		System.out.println("r - Replace player");
		System.out.println("o - Output roster");
		System.out.println("q - Quit");
	}
	//update player rating
	public static void updatePlayerRating(Scanner scnr, int[] jerseyNumbers, int[] ratings) {
		System.out.println("Enter a jersey number:");
		int jerseyNum = scnr.nextInt();
		boolean found = false;
		
		for (int i = 0; i < jerseyNumbers.length; i ++) {
			if (jerseyNumbers[i] == jerseyNum) {
				System.out.println("Enter a new rating for player:");
				ratings[i] = scnr.nextInt();
				System.out.println();
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Player not found.");
		}
	}
	//output player above a rating
	public static void outputPlayersAboveRating(Scanner scnr, int[] jerseyNumbers, int[] ratings) {
		System.out.println("Enter a rating:");
		int ratingThreshold = scnr.nextInt();
		
		System.out.println("\nABOVE " + ratingThreshold);
		for (int i = 0; i < ratings.length; i++) {
			if (ratings[i] > ratingThreshold) {
				System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNumbers[i] + ", Rating: " + ratings[i]);
			}
		}System.out.println();
	}
	//replace player
	public static void replacePlayer(Scanner scnr, int[] jerseyNumbers, int[] ratings) {
		System.out.println("Enter a jersey number:");
		int jerseyNum = scnr.nextInt();
		boolean found = false; 
		
		for (int i = 0; i < jerseyNumbers.length; i++) {
			if (jerseyNumbers[i] == jerseyNum) {
				System.out.println("Enter a new jersey number:");
				jerseyNumbers[i] = scnr.nextInt();
				
				System.out.println("Enter a rating for the new player:");
				ratings[i] = scnr.nextInt();
				System.out.println();
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Player not found.");
		}
	}
  }

/*CODE OUTPUT:
 * 
 * 
*/