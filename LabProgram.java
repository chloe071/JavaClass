/*HEADER COMMENT BLOCK
 * Author: Chloe Cedano
 * Course COP2250
 * date: 3/17/2025
 * Assignment: zylab(LM) print string in reverse
 * Instructor: Sergio Pisano
 * Description: Takes in a line of text as input and outputs that line of text in reverse.
 */
import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		while (true) {
			String userInput = scnr.nextLine();
			
			//check for exit conditions
			if (userInput.equals("Done") || userInput.equals("done") || userInput.equals("d")) {
				break;
			}
			
			//reverse the string
			String reversed = "";
			for (int i = userInput.length() - 1; i >= 0; i--) {
				reversed += userInput.charAt(i);
			}
			//output the reversed string
			System.out.println(reversed);
		}
	}
}
/*CODE OUTPUT
 * ereht olleH
 * yeH
 */