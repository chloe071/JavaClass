/*
 * HEADER COMMENT BLOCK
 * Author: Chloe Cedano
 * Course COP 2250
 * Date: 3/17/25
 * Assignment:zyLAb (H)
 * Instructor: Sergio Pisano
 * Description: Plays an automated game of Rock, Paper, Scissors. 
 */
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int ROCK = 0;
		final int PAPER = 1;
		final int SCISSORS = 2;
		Random rand = new Random();
		int seed = scnr.nextInt();
		rand.setSeed(seed);
		
		String player1 = scnr.next();
	      String player2 = scnr.next();
	      int rounds = scnr.nextInt();

	      while (rounds < 1) {
	         System.out.println("Rounds must be > 0");
	         rounds = scnr.nextInt();
	      }

	      System.out.println(player1 + " vs " + player2 + " for " + rounds + " rounds");

	      int player1Wins = 0;
	      int player2Wins = 0;

	      for (int round = 0; round < rounds; round++) {
	         int p1Move = rand.nextInt(3);
	         int p2Move = rand.nextInt(3);

	         while (p1Move == p2Move) {
	            System.out.println("Tie");
	            p1Move = rand.nextInt(3);
	            p2Move = rand.nextInt(3);
	         }

	         if ((p1Move == ROCK && p2Move == SCISSORS) ||
	             (p1Move == PAPER && p2Move == ROCK) ||
	             (p1Move == SCISSORS && p2Move == PAPER)) {
	            // Player 1 wins
	            System.out.print(player1 + " wins with ");
	            if (p1Move == ROCK) {
	               System.out.println("rock");
	            } else if (p1Move == PAPER) {
	               System.out.println("paper");
	            } else {
	               System.out.println("scissors");
	            }
	            player1Wins++;
	         } else {
	            // Player 2 wins
	            System.out.print(player2 + " wins with ");
	            if (p2Move == ROCK) {
	               System.out.println("rock");
	            } else if (p2Move == PAPER) {
	               System.out.println("paper");
	            } else {
	               System.out.println("scissors");
	            }
	            player2Wins++;
	         }
	      }

	      System.out.println(player1 + " wins " + player1Wins + " and " + player2 + " wins " + player2Wins);
	   }
	}
/*CODE OUTPUT:
 * Anna vs Bert for 1 rounds
 * Tie
 * Tie
 * Bert wins with rock
 * Anna wins 0 and Bert wins 1
 */
 