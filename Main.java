/*
 * HEADER COMMENT BLOCK
 * Author: Chloe Cedano
 * Course: COP2250
 * Date: 4/9/2025
 * Assignment: ZYLAB(LM)
 * Instructor: Sergio Pisano
 * Description: Copies only negative values. 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int NUM_ELEMENTS = 6;
		Scanner scnr = new Scanner(System.in);
		ArrayList<Integer> listInts = new ArrayList<Integer>();
		ArrayList<Integer> listNegInts = new ArrayList<Integer>(); //declare listNegInts
		
		//get input integers
		for (int i = 0; i < NUM_ELEMENTS; ++i) {
			listInts.add(scnr.nextInt());	
		}
		//copy negative integers to listNegInts
		for (int num : listInts) {
			if (num < 0) { //check if the number is negative
				listNegInts.add(num); //add to listNegInts
			}
		}
		//output the number of negative elements
		System.out.println(listNegInts.size());
		
		// output the negative integers
		for (int negNum : listNegInts) {
			System.out.println(negNum);
		}

	}
}
/*COMMENT OUTPUT:
 * 3
 * -2
 * -66
 * -4
 */
