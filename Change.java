import java.text.DecimalFormat;
import java.util.Scanner;
/***Problem with entering decimalformat**/

public class Change {	
	public static void main(String[] args)

	{	
		
		double x = 4.53;
		double x0;
	
     		

		System.out.println("Order Total is: $4.57");
		Scanner userInputScanner = new Scanner(System.in);
		System.out.println( "Enter Payment Amount");
 		x0 = userInputScanner.nextDouble();
		System.out.println("Payment: " + String.format("$%,.2f", x0));

		System.out.println("Change Owed: " + String.format("$%,.2f",(x0 - x)));
		
		DecimalFormat df = new DecimalFormat("#");
		df.setRoundingMode(java.math.RoundingMode.DOWN);
		double min = x0-x;

		double x1 = min / .25;
		min %= .25;
		double y1 = min / .1;
		min %= .1;
		double z1 = min / .05;
		min %= .05;
		double a1 = (min / .01) + 1;
		
		
		System.out.println("Quarters: " + df.format(x1));
		System.out.println("Dimes: " + df.format(y1));
		System.out.println("Nickels: " + df.format(z1));
		System.out.println("Pennies: " + df.format(a1));
	}
	
}