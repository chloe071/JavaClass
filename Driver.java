/*
 * Header Comment Block
 * Author: Chloe Cedano
 * Course COP2250
 * Date: 1/25/2025
 * Assignment: 
 * Instructor: Sergio Pisano
 * Description: This program calculates hourly wages plus overtime.
 */
public class Driver {

	public static void main(String[] args) {
		double regularWages; //regular wages total calculation
		double basePay = 15; //base rate in $
		double regularHours = 8; //hours worked by employee
		double overtimeWages; //overtime wages total calculation
		double overtimeHours = 3; //overtime hours worked
		double totalWages; //addition of regular wages and overtime wages

		//calculation of regular wages total
		regularWages = basePay * regularHours;

		//calculate the overtime wages
		overtimeWages = (basePay * 1.5) * overtimeHours;

		//calculate the total wages
		totalWages = regularWages + overtimeWages;

		//display value for average paid per hour
		System.out.printf("Regular Wages: $%.2f%n", regularWages);
		System.out.printf("Overtime Wages: $%.2f%n", overtimeWages);
		System.out.printf("Total Wages: $%.2f%n", totalWages);

	}
}
/*
 *Code Output:
 *Regular Wages: 120.00
 *Overtime Wages: $67.50
 *Total Wages: $187.50 
*/