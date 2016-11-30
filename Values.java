public class Values {	
	public static void main(String[] args)

	{	
		
		double x = 89;
		double y = 86;
		double avg = (x +y)/2;

		System.out.println("Test Average: " + avg);
		
		double x1 = 84;
		double y1 = 84;
		double z1 = 83;
		double avgtwo = (x1 +y1 + z1)/3;

		System.out.println("Quiz Average: " + avgtwo);

		double x2 = 90.12;

		double Finalavg1 = ((avg) * .5) + ((avgtwo) * .3) + ((x2) * .2);
		
		System.out.println("Final Average: " + Finalavg1);
		
	}
	
}