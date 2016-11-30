import java.util.Scanner;

public class Values2 {	
	public static void main(String[] args)

	{	
		Scanner userInputScanner = new Scanner(System.in);
		double x  = 0, y = 0;
		double avg;


        	System.out.println("First Test Grade: ");
       		 x = userInputScanner.nextInt();
		System.out.println("Second Test Grade: ");
       		 y = userInputScanner.nextInt();

	
		 avg = (x +y)/2;

		System.out.println("Final Test Average: " + avg);
		



		
		double x1  = 0, y1 = 0, z1 = 0;
		double avgtwo;


        	System.out.println("First Quiz Grade: ");
       		 x1 = userInputScanner.nextInt();
		System.out.println("Second Quiz Grade: ");
       		 y1 = userInputScanner.nextInt();
		System.out.println("Third Quiz Grade: ");
       		 z1 = userInputScanner.nextInt();
	
		 avgtwo = (x1 +y1 + z1)/3;

		System.out.println("Final Quiz Average: " + avgtwo);

		

		
		double x2  = 0.00;
		double Finalavg1;


        	System.out.println("Homework Grade: ");
       		 x2 = userInputScanner.nextInt();
		
	/****
	* Throws exception on finalavg1
	* Need other exceptions like enter less than 100 or numbers only
	*create infinite enters and divisions with hit certain key to stop
	****\
		Finalavg1 = ((avg) * .5) + ((avgtwo) * .3) + ((x2) * .2);

		System.out.println("Final Average: " + Finalavg1);
		
	}
	
}