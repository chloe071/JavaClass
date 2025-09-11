/*
 * HEADER COMMENT BLOCK
 * Author: Chloe Cedano
 * Course: COP2250
 * Date: 3/17/2025
 * Assignment: zylab(LM) Brute force equation solver
 * Instructor: Sergio Pisano
 * Description: Given integer coefficients of two linear eqaations with x and y variable use brute force to find an integer solution for x and y in the range -10 to 10.
 */
import java.util.Scanner;
public class BruteForce {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//Read coefficients for equation 1: a1 * x + b1 * y =c1
		int a1 = scnr.nextInt();
		int b1 = scnr.nextInt();
		int c1 = scnr.nextInt();
		
		//read coefficients for equation 2: a2 * x + b2 * y =c2
		int a2 = scnr.nextInt();
		int b2 = scnr.nextInt();
		int c2 = scnr.nextInt();
		
		boolean solutionFound = false;
		
		//try all possible integer values for x and y from -10 to 10
		for (int x = -10; x <= 10; x++) {
			for (int y = -10; y <= 10; y++) {
				//check if the pair (x, y) satisfies both equations
				if (a1 * x + b1 * y == c1 && a2 * x + b2 * y == c2) {
					System.out.println("x = " + x + ", y = " + y);
					solutionFound = true;
					break; //exit inner loop
				}
			}
			if (solutionFound) {
				break; //exit outer loop
			}
		}
		
		if (!solutionFound) {
			System.out.println("There is no solution");
		}
	}
}
/*CODE OUTPUT
 * x = 3, y = 2
 */