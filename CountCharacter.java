/*
 * HEADER COMMENT BLOCK
 * Author: Chloe Cedano
 * Course: COP2250
 * Date: 3/17/2025
 * Assignment: zylab(LM): Count characters
 * Instructor: Sergio Pisano
 * Description: Input is a character and a string, and whose output indicates the number of times the character appears in the string. 
 */
import java.util.Scanner;
public class CountCharacter {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//read inputs: character and full line of text
		char inputChar = scnr.next().charAt(0);
		String inputStr = scnr.nextLine().trim(); //read rest of the line
		
		int count = 0;
		
		//loop through each character in the string
		for (int i = 0; i < inputStr.length(); i++) {
			if (inputStr.charAt(i) == inputChar) {
				count++;
			}
		}
		
		//output logic: singular or plural
		if (count == 1) {
			System.out.println("1 " + inputChar);
		} else {
			System.out.println(count + " " + inputChar + "'s");
		}
	}
}
/*CODE OUTPUT:
 * 1 n
 */