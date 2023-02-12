import java.util.*;
class CheckDouble
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);//create object of class Scanner
		System.out.println("Enter two numbers: ");
		
		if(sc.hasNextDouble() && sc.hasNextDouble())
		{
			System.out.println("Both entered numbers are type double ");
			double d1 = sc.nextDouble();
			double d2 = sc.nextDouble();
		//Don't worry, sc.nextDouble() will take already entered values 
		//and assign to d1 and d2
			System.out.println("Average of entered numbers = "+((d1+d2)/2));
		}
		else
			System.out.println("One of the entered numbers is not double type.");
		
		sc.close();
	}
}