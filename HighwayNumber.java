/*
 * HEADER COMMENT BLOCK
 * Author: Chloe Cedano
 * Course: COP2250
 * Date: 2/27/2025
 * Assignment: zyLab(LM) interstate highway numbers
 * Instructor: Sergio Pisano
 * Description:Find whether the highway number is a primary or auxiliary highway. 
 */
import java.util.Scanner;
public class HighwayNumber {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		//read highway number from input
		int highwayNumber = scnr.nextInt();
		
		//validate hiway number range
		if (highwayNumber < 1 || highwayNumber > 999) {
			System.out.println(highwayNumber + " is not a valid interstate highway number.");
			return;
		}
		
		//determine if the hiway is primary(1-99) or auxiliary (100-999)
		if (highwayNumber >= 1 && highwayNumber <= 99) {
			//primary highways (1-99)
			String direction = (highwayNumber % 2 == 0) ? "east/west" : "north/south";
			System.out.println("I-" + highwayNumber + " is primary, going " + direction + ".");
		}
		else {
			//auxilary highways (100-999) must have a valid primary highway
			int primaryNumber = highwayNumber % 100;
			//check if the extracter number is valid
			if (primaryNumber == 0) {
				System.out.println(highwayNumber + " is not a valid interstate highway number.");
			} else {
				String direction = (primaryNumber % 2 == 0) ? "east/west" : "north/south";
				System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going " + direction + ".");
			}
		}
	}
}
/*
 * CODE OUTPUT
 * I-290 is auxiliary, serving I-90, going east/west.
 */