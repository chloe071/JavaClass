/*
 * HEADER COMMENT BLOCK
 * Author: Chloe Cedano
 * Course: COP2250
 * Date: 4/9/2025
 * Assignment: zyLab (LM)
 * Instructor: Sergio Pisano
 * Description: Removes all odd numbers from an array. 
 */
import java.util.Arrays;

public class OddNumbers {

	public static int[] removeOdds(int[] nums) {
		//count the number of even numbers in the array
		int count = 0;
		for (int num : nums) {
			if (num% 2 ==0) {
				count++;
			}
		}
		//create a new array to store only even numbers
		int[] evens = new int[count];
		int index = 0;
		
		//populate the new array with even numbers
		for (int num : nums) {
			if (num % 2 == 0) {
				evens[index] = num;
				index++;
			}
		}
		
		return evens;

	}
	public static void main(String[] args) {
		int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] result = removeOdds(input);
		
		//helper method Arrays.toString() converts int[] to a String
		System.out.println(Arrays.toString(result)); 
	}
}
/* CODE OUTPUT:
 * [2, 4, 6, 8]
*/
