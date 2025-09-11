import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double x;
		double y;
		double z;
		
		//input values
		x = scnr.nextDouble();
		y = scnr.nextDouble();
		z = scnr.nextDouble();
		
		//calculate the required values
	      double powerXZ = Math.pow(x, z);
	      double powerYz = Math.pow(y, z);
	      double powerXYz = Math.pow(x, powerYz);
	      double absY = Math.abs(y);
	      double sqrtXYz = Math.sqrt(Math.pow(x * y, z));
		
		//output the results
	      System.out.printf("%.2f %.15E %.1f %.1f\n", powerXZ, powerXYz, absY, sqrtXYz);
	}
}
